# How to run

Be sure that agl relavant software stacks are installed. If not, please follow [this guide](https://docs.automotivelinux.org/en/salmon/#01_Getting_Started/02_Building_AGL_Image/06_Building_the_AGL_Image/02_Building_for_x86_%28Emulation_and_Hardware%29/) and install the `salmon` version.

Clone this repo to `$AGL_TOP/salmon` directory. Be sure of exporting your workspace environment `AGL_TOP`.

```sh
git clone https://github.com/CihatAltiparmak/meta-agl-gsoc-quiz-2025
```

Source the script `aglsetup.sh` to put the this layer to configuration files. In this documantaion, we will be using `qemux86-64` machiene configuration.
```sh
source meta-agl/scripts/aglsetup.sh -m qemux86-64 -b qemux86-64 agl-flutter agl-devel agl-quiz2025
```

Now you're in `$AGL_TOP/salmon/qemux86-64` . Source `agl-init-build-env` script.

```
source agl-init-build-env
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
