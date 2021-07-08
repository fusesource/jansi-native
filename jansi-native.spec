%global bits %{__isa_bits}
%global debug_package %{nil}

# jansi-native-1.8 tag is missing from git
# https://github.com/fusesource/jansi-native/commit/5015ad0
%global commit 5015ad023a55785dbe6ad19cc786c0533387feff

Name:           jansi-native
Version:        1.8
Release:        1%{?dist}
Summary:        Jansi Native implements the JNI Libraries used by the Jansi project
License:        ASL 2.0
URL:            http://jansi.fusesource.org/
Source0:        https://github.com/fusesource/jansi-native/archive/%{commit}/jansi-native-%{version}.tar.gz

BuildRequires:  maven-local
BuildRequires:  mvn(junit:junit)
BuildRequires:  mvn(org.apache.felix:maven-bundle-plugin)
BuildRequires:  mvn(org.fusesource:fusesource-pom:pom:)
BuildRequires:  mvn(org.fusesource.hawtjni:maven-hawtjni-plugin) >= 1.9-2
BuildRequires:  mvn(org.fusesource.hawtjni:hawtjni-runtime) >= 1.9-2

%description
Jansi is a small java library that allows you to use ANSI escape sequences
in your Java console applications. It implements ANSI support on platforms
which don't support it like Windows and provides graceful degradation for
when output is being sent to output devices which cannot support ANSI sequences.

%package javadoc
Summary:          Javadocs for %{name}
BuildArch:        noarch

%description javadoc
This package contains the API documentation for %{name}.

%prep
%setup -q -n jansi-native-%{commit}

%mvn_alias :jansi-linux%{bits} :jansi-linux
%mvn_file :jansi-linux%{bits} %{name}/jansi-linux%{bits} %{name}/jansi-linux

%build
%mvn_build
%mvn_build -- -Dplatform=linux%{bits}

%install
%mvn_install

%files -f .mfiles
%doc readme.md changelog.md
%license license.txt

%files javadoc -f .mfiles-javadoc
%license license.txt

%changelog
* Sat Oct 05 2019 Fabio Valentini <decathorpe@gmail.com> - 1.8-1
- Update to version 1.8.

* Thu Jul 25 2019 Fedora Release Engineering <releng@fedoraproject.org> - 1.7-9
- Rebuilt for https://fedoraproject.org/wiki/Fedora_31_Mass_Rebuild

* Fri Feb 01 2019 Fedora Release Engineering <releng@fedoraproject.org> - 1.7-8
- Rebuilt for https://fedoraproject.org/wiki/Fedora_30_Mass_Rebuild

* Thu Jul 26 2018 Michael Simacek <msimacek@redhat.com> - 1.7-7
- Build missing native lib

* Fri Jul 13 2018 Fedora Release Engineering <releng@fedoraproject.org> - 1.7-6
- Rebuilt for https://fedoraproject.org/wiki/Fedora_29_Mass_Rebuild

* Fri Feb 09 2018 Igor Gnatenko <ignatenkobrain@fedoraproject.org> - 1.7-5
- Escape macros in %%changelog

* Wed Feb 07 2018 Fedora Release Engineering <releng@fedoraproject.org> - 1.7-4
- Rebuilt for https://fedoraproject.org/wiki/Fedora_28_Mass_Rebuild

* Wed Aug 02 2017 Fedora Release Engineering <releng@fedoraproject.org> - 1.7-3
- Rebuilt for https://fedoraproject.org/wiki/Fedora_27_Binutils_Mass_Rebuild

* Wed Jul 26 2017 Fedora Release Engineering <releng@fedoraproject.org> - 1.7-2
- Rebuilt for https://fedoraproject.org/wiki/Fedora_27_Mass_Rebuild

* Wed Jun 14 2017 Michael Simacek <msimacek@redhat.com> - 1.7-1
- Update to upstream version 1.7

* Fri Feb 10 2017 Fedora Release Engineering <releng@fedoraproject.org> - 1.5-11
- Rebuilt for https://fedoraproject.org/wiki/Fedora_26_Mass_Rebuild

* Thu Feb 04 2016 Fedora Release Engineering <releng@fedoraproject.org> - 1.5-10
- Rebuilt for https://fedoraproject.org/wiki/Fedora_24_Mass_Rebuild

* Wed Jun 17 2015 Fedora Release Engineering <rel-eng@lists.fedoraproject.org> - 1.5-9
- Rebuilt for https://fedoraproject.org/wiki/Fedora_23_Mass_Rebuild

* Sat Aug 16 2014 Fedora Release Engineering <rel-eng@lists.fedoraproject.org> - 1.5-8
- Rebuilt for https://fedoraproject.org/wiki/Fedora_21_22_Mass_Rebuild

* Sun Aug 03 2014 Yaakov Selkowitz <yselkowi@redhat.com> - 1.5-7
- Fix FTBFS due to XMvn changes in F21 (#1106820)

* Sat Jun 07 2014 Fedora Release Engineering <rel-eng@lists.fedoraproject.org> - 1.5-6
- Rebuilt for https://fedoraproject.org/wiki/Fedora_21_Mass_Rebuild

* Fri May 23 2014 Mikolaj Izdebski <mizdebsk@redhat.com> - 1.5-5
- Cleanup BuildRequires

* Thu Mar  6 2014 Mikolaj Izdebski <mizdebsk@redhat.com> - 1.5-4
- Require hawtjni >= 1.9-2

* Tue Mar 04 2014 Stanislav Ochotnicky <sochotnicky@redhat.com> - 1.5-4
- Use Requires: java-headless rebuild (#1067528)

* Fri Jan 10 2014 Mikolaj Izdebski <mizdebsk@redhat.com> - 1.5-4
- Install attached artifacts
- Resolves: rhbz#1028550

* Tue Nov 26 2013 Marek Goldmann <mgoldman@redhat.com> - 1.5-3
- Mark javadoc subpackage as noarch

* Mon Nov 25 2013 Marcin Juszkiewicz <mjuszkiewicz@redhat.com> - 1.5-2
- Use %%__isa_bits macro to support all architectures

* Wed Sep 11 2013 Marek Goldmann <mgoldman@redhat.com> - 1.5-1
- Upstream release 1.5

* Tue Aug 06 2013 Marek Goldmann <mgoldman@redhat.com> - 1.4-7
- New guidelines

* Sat Aug 03 2013 Fedora Release Engineering <rel-eng@lists.fedoraproject.org> - 1.4-6
- Rebuilt for https://fedoraproject.org/wiki/Fedora_20_Mass_Rebuild

* Thu Feb 14 2013 Fedora Release Engineering <rel-eng@lists.fedoraproject.org> - 1.4-5
- Rebuilt for https://fedoraproject.org/wiki/Fedora_19_Mass_Rebuild

* Wed Feb 06 2013 Java SIG <java-devel@lists.fedoraproject.org> - 1.4-4
- Update for https://fedoraproject.org/wiki/Fedora_19_Maven_Rebuild
- Replace maven BuildRequires with maven-local

* Wed Dec 19 2012 Stanislav Ochotnicky <sochotnicky@redhat.com> - 1.4-3
- revbump after jnidir change

* Wed Dec 12 2012 Stanislav Ochotnicky <sochotnicky@redhat.com> - 1.4-2
- Move normal jar from javajnidir to javadir

* Wed Sep 19 2012 Marek Goldmann <mgoldman@redhat.com> - 1.4-1
- Upstream release 1.4
- Fixing "archiver requires 'AM_PROG_AR' in 'configure.ac'" error
- FTBFS: config.status: error: cannot find input file: `Makefile.in' RHBZ#858377

* Thu Jul 19 2012 Fedora Release Engineering <rel-eng@lists.fedoraproject.org> - 1.2-4
- Rebuilt for https://fedoraproject.org/wiki/Fedora_18_Mass_Rebuild

* Fri Jan 13 2012 Fedora Release Engineering <rel-eng@lists.fedoraproject.org> - 1.2-3
- Rebuilt for https://fedoraproject.org/wiki/Fedora_17_Mass_Rebuild

* Wed Oct 26 2011 Dan Horák <dan[at]danny.cz> 1.2-2
- fix build on non-x86 64-bit arches

* Thu Jul 28 2011 Marek Goldmann <mgoldman@redhat.com> 1.2-1
- Upstream release 1.2
- Using new jnidir

* Tue May 31 2011 Marek Goldmann <mgoldman@redhat.com> 1.1-2
- Updated summary
- Removed debuginfo package
- Added license to javadoc package
- Fixed dependency on maven-hawtjni-plugin

* Fri May 27 2011 Marek Goldmann <mgoldman@redhat.com> 1.1-1
- Initial packaging

