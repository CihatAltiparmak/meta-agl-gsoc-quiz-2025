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
# LICENSE = "BSD-3-Clause"
# LIC_FILES_CHKSUM = "file://LICENSE;md5=b7eeb61b41ae366e94383bca5e113fce"

SRCREV = "8bbcca327c43615f454f6a82acb6bf0507adf734"
SRC_URI = "git://github.com/DarkusAlphaHydranoid/agl-gsoc-flutter-app.git;lfs=1;branch=main;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "agl_gsoc_flutter_app"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "agl-gsoc-flutter-app"
PUBSPEC_IGNORE_LOCKFILE = "1"
# FLUTTER_APPLICATION_PATH = "agl_gsoc_flutter_app"

inherit flutter-app

do_compile[network] = "1"
