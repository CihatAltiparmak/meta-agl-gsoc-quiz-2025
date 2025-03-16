#
# Copyright (c) 2020-2024 Cihat Kurtuluş Altıparmak. All rights reserved.
#

SUMMARY = "agl_gsoc_flutter_app"
DESCRIPTION = "A new Flutter project."
AUTHOR = "Cihat Kurtuluş Altıparmak"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "CLOSED"

SRCREV = "50ca7e5483f120aef9b378ebfa7cb4e2bfa1e5ca"
SRC_URI = "git://github.com/DarkusAlphaHydranoid/agl-gsoc-flutter-app.git;lfs=1;branch=main;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "agl_gsoc_flutter_app"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "agl-gsoc-flutter-app"
PUBSPEC_IGNORE_LOCKFILE = "1"
# FLUTTER_APPLICATION_PATH = "agl_gsoc_flutter_app"

inherit flutter-app

do_compile[network] = "1"
