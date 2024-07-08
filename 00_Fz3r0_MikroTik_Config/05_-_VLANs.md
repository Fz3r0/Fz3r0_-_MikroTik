# 05 - Configuración de VLANs en MikroTik

## Recursos

- [Cómo configurar VLAN en Windows](https://www.youtube.com/watch?v=9GPKUmVyYGs)
- [Mikrotik desde cero - DHCP - Interfaces](https://youtu.be/_53hjQtk73M?si=3DAu2lMT07Yiagbp)

## VLANs en PC

En caso de que se conecte la **PC directamente al MikroTik sin un Switch** que ya tenga una `Untagged VLAN` / `Native VLAN` es necesario configurar una VLAN en la PC para que pueda alcanzar las VLANs dentro de la troncal sin necesidad de dispositivos adicional (como un switch), eso se hace de la siguiente manera:

1. Ir a `Control Panel > Network and Internet`

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/95491bcc-eb8e-499f-9b6d-a70b85551b35)

2. Ir a `Network and Sharing Center`

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/b262697b-67b4-44ab-b333-fcc3bb341ede)

3. Ir a `Change Adapter Settings`

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/dcfe016b-ed7f-4f9c-adfa-0de1bfc245e6)

4. Seleccionar el adaptador Ethernet que estemos usando y entrar con `botón derecho :: Properties`

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/59aa517b-d1bf-4087-8c8b-e61727a66bd1)

5. Dar click en `Configure`

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/de561479-6420-4058-ba02-a701348873e5)

6. Ir a la pestaña `Advanced` y seleccionar `Packet Priority and VLAN` y revisar que esté activado el modo con VLANs 

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/5aa71d92-9250-47b9-ac8b-4a9c94c92a2b)

7. En la misma pestaña `Advanced` bajar a donde dice `Locally Administer Addresses` y cambiar la VLAN (En mi caso puse la VLAN 1)

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/781d117e-038c-4554-8d41-b223934bc2fc)

8. Dar OK y validar configuraciones alcanzando la red que esté en VLAN 1

## Configuración de VLANs en MikroTik





