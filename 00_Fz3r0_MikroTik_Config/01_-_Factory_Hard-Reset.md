# Factory Reset

## Recursos

- [MikroTips: reset](https://www.youtube.com/watch?v=6Unz92rABs8)
- [](https://help.mikrotik.com/docs/display/UM/RB2011iL-RM)

## ¿Cómo hacer Hard-Reset?

1. Apagar dispositivo
2. Mantener presionado botón de reset
3. Encender Dispositivo
4. Dejar de prestionar botón reset **inmediatamente después que los LEDS verden parpadeén**

En caso de oprimir pot más tiempo ocurren las siguientes opciones: 

The RouterBOOT reset button has the following functions. Press the button and apply the power, then:

- Release the button when green LED starts flashing, to reset RouterOS configuration to defaults.
- Release the button when the LED turns solid green to clear all configuration and bridge all interfaces.
- Release the button after LED is no longer lit (~20 seconds) to cause a device to look for Netinstall servers (required for reinstalling RouterOS over the network).

Regardless of the above option used, the system will load the backup RouterBOOT loader if the button is pressed before power is applied to the device. Useful for RouterBOOT debugging and recovery.

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/76e934a2-6111-4931-a800-3472bb8f5849)

