Name:		bazel
Version:	0.18.1
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
BuildRequires:	openjdk
BuildRequires:	openjdk-jre
BuildRequires:	openjdk-jre-essentials
BuildRequires:	python
BuildRequires:	pkgconfig
BuildRequires:	pkgconfig(zlib)

%description
Bazel Build for Tizen

%prep
%setup -q
chmod 0644 AUTHORS CHANGELOG.md CONTRIBUTORS LICENSE
cp %{SOURCE1000} .

%build
CC=gcc
CXX=g++
EXTRA_BAZEL_ARGS="--host_javabase=@local_jdk//:jdk" bash ./compile.sh
./output/bazel shutdown

%install
export NO_BRP_STRIP_DEBUG=true
export NO_DEBUGINFO_STRIP_DEBUG=true
%define __debug_install_post %{nil}
: >debugfiles.list
: >debugsources.list
: >debugsourcefiles.list

install -Dm0755 output/bazel %{buildroot}%{_bindir}/bazel

%files
%manifest bazel.manifest
%doc AUTHORS CHANGELOG.md CONTRIBUTORS
%license LICENSE
%{_bindir}/bazel

%changelog
* Wed Jul 24 2019 MyungJoo Ham <myungjoo.ham@samsung.com>
- Packaged bazel, based on OpenSUSE SLE-15-SP1 backports.
