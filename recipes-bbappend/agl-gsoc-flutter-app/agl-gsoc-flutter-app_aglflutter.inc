FILESEXTRAPATHS:prepend := "${THISDIR}/agl-gsoc-flutter-app:"

SRC_URI += "file://agl-gsoc-flutter-app.service \
            file://agl-gsoc-flutter-app.toml \
"

APP_CONFIG = "agl-gsoc-flutter-app.toml"

inherit systemd

do_install:append() {
    install -D -m 0644 ${WORKDIR}/${BPN}.service ${D}${systemd_system_unitdir}/${BPN}.service
}

RDEPENDS:${PN} += "agl-flutter-env"

SYSTEMD_SERVICE:${PN} = "agl-gsoc-flutter-app.service"
