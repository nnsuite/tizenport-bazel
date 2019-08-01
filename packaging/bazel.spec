%global debug_package %{nil}
%global __debug_install_post %{nil}
%global __os_install_post %{nil}
# No debug pkg. No strip (Bazel is broken if stripped.)

Name:		bazel
Version:	0.19.2
%ifarch aarch64
Source100:	bazel_aarch64.00
Source101:	bazel_aarch64.01
Source102:	bazel_aarch64.02
%endif
Release:	0
Summary:	Bazel
License:	Apache-2.0
Group:		Development/Tools
Url:		https://github.com/bazelbuild/bazel

Source0:	bazel-%{version}.tar.gz

Source1000:	bazel.manifest

BuildRequires:	bash
BuildRequires:	unzip, zip
BuildRequires:	gcc-c++
%ifnarch aarch64
BuildRequires:	openjdk
BuildRequires:	openjdk-jre
BuildRequires:	openjdk-jre-essentials
BuildRequires:	python
BuildRequires:	pkgconfig
BuildRequires:	pkgconfig(zlib)
%endif

Requires:	openjdk
Requires:	openjdk-jre
Requires:	openjdk-jre-essentials

# Bazel does not support intel-32b arch.
ExcludeArch:	%ix86

%description
Bazel Build for Tizen

%prep
%setup -q
chmod 0644 AUTHORS CHANGELOG.md CONTRIBUTORS LICENSE
cp %{SOURCE1000} .

%build
%ifarch aarch64

# Prebuilt binary will be used for aarch64

%else

%ifarch aarch64 %arm
export BAZEL_JAVAC_OPTS="-J-Xmx2g -J-Xms200m"
%endif
CC=gcc
CXX=g++
export PYTHON_BIN_PATH=/usr/bin/python
EXTRA_BAZEL_ARGS="--jobs 1 --host_javabase=@local_jdk//:jdk" bash ./compile.sh
./output/bazel shutdown
%endif

%install
export NO_BRP_STRIP_DEBUG=true
export NO_DEBUGINFO_STRIP_DEBUG=true

%ifarch aarch64
mkdir -p %{buildroot}%{_bindir}
cat %{SOURCE100} %{SOURCE101} %{SOURCE102} > %{buildroot}%{_bindir}/bazel
chmod 0755 %{buildroot}%{_bindir}/bazel
# Prebuilt binary will be used for aarch64
%else
install -Dm0755 output/bazel %{buildroot}%{_bindir}/bazel
%endif

%files
%manifest bazel.manifest
%doc AUTHORS CHANGELOG.md CONTRIBUTORS
%license LICENSE
%{_bindir}/bazel

%changelog
* Wed Jul 24 2019 MyungJoo Ham <myungjoo.ham@samsung.com>
- Packaged bazel, based on OpenSUSE SLE-15-SP1 backports.
