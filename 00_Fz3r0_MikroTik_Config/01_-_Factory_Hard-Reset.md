# Factory Reset

## Recursos

- [Como realizar un reset correctamente en Mikrotik Routerboard - RB2011UiAS-2HnD-IN](https://www.youtube.com/watch?v=flhg0aLyBjU)

## ¿Cómo hacer Hard-Reset @ RB2011UiAS-2HnD-IN?

1. Desconectar todos los puertos Ethernet que se tengan conectados
2. Apagar dispositivo desconectándo el adaptador de corriente
3. Mantener presionado botón de reset mientras el MikroTik se encuentra apagado
4. Conectar MikroTik mientras se continúa presionando botón de reset
5. Mantener el botón de reset presionadno **entre 5 y 7 segundos**

La manera de saber que se hizo bien el Hard-Reset es que se verá la siguiente pantalla: 

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/3f044f73-4085-475c-a402-f2cedf110698)

En caso de oprimir por más tiempo ocurren las siguientes opciones, **pero no se hace Hard-Reset**: 

The RouterBOOT reset button has the following functions. Press the button and apply the power, then:

- Release the button when green LED starts flashing, to reset RouterOS configuration to defaults.
- Release the button when the LED turns solid green to clear all configuration and bridge all interfaces.
- Release the button after LED is no longer lit (~20 seconds) to cause a device to look for Netinstall servers (required for reinstalling RouterOS over the network).

Regardless of the above option used, the system will load the backup RouterBOOT loader if the button is pressed before power is applied to the device. Useful for RouterBOOT debugging and recovery.



