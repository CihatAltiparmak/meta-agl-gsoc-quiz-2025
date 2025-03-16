# How to run

Be sure that agl relavant software stacks are installed. If not, please follow [this guide](https://docs.automotivelinux.org/en/salmon/#01_Getting_Started/02_Building_AGL_Image/06_Building_the_AGL_Image/02_Building_for_x86_%28Emulation_and_Hardware%29/) and install the `salmon` version.

Clone this repo to `$AGL_TOP/salmon` directory. Be sure of exporting your workspace environment `AGL_TOP`.

```sh
git clone https://github.com/CihatAltiparmak/meta-agl-gsoc-quiz-2025
```

Add the below lines in the end of the the configuration file `bblayers.conf` like below. In this documantaion, we will be using `qemux86-64` machiene configuration. So, edit the file `$AGL_TOP/salmon/qemux86-64/conf/bblayers.conf`.

```
BBLAYERS =+ "  \
    ${METADIR}/meta-agl-gsoc-quiz-2025 \
"
```

Compile yocto image

```sh
time bitbake quiz2025
```

Run demo

```sh
runqemu  kvm serialstdio slirp -audio
```

In the end, you should see the window like below.

![Screenshot from 2025-03-16 22-39-19](https://github.com/user-attachments/assets/1eba9591-4948-4cd2-9c93-a3504d4e9758)
