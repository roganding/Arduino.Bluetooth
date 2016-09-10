##The communication between Arduino and other devices over Bluetooth.

###What we need:
- Arduino Leonardo
- USB Bluetooth Dongle 4.0
- direct-current motor


###[Serial Bluetooth Terminal on Linux](http://pi19404.github.io/pyVision/2015/04/03/22/)

```bash
$ sudo apt-get install bluez bluez-tools
$ hciconfig
$ hcitool scan
$ bluez-simple-agent xx:xx:xx:xx:xx   # the bluetooth device you want to pair
```

In /etc/bluetooth/rfcomm.conf:
```bash
rfcomm 0 {
    bind no;
    device xx:xx:xx:xx:xx;
    channel 1;
    comment "Serial Port";
}
```

```bash
$ sudo rfcomm0 connect 0
```
