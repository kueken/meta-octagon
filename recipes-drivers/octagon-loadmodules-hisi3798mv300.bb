SUMMARY = "kernel modules load helper"
MAINTAINER = "octagon"
PACKAGE_ARCH = "${MACHINE_ARCH}"

require conf/license/license-gplv2.inc

PV = "1.0"
PR = "r0"

SRC_URI = "file://octagon-loadmodules-hisi3798mv300.sh"

INITSCRIPT_NAME = "octagon-loadmodules"
INITSCRIPT_PARAMS = "start 04 S ."

inherit update-rc.d

S = "${WORKDIR}"

do_compile() {
}

do_install() {
    install -d ${D}/etc/init.d/
    install -m 0755 ${WORKDIR}/octagon-loadmodules-hisi3798mv300.sh ${D}/etc/init.d/octagon-loadmodules
}