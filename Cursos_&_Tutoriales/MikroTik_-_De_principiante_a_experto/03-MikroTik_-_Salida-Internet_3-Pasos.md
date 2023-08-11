## Salida a Internet

Los 3 pasos de configuración para salir a Internet de LAN @ WAN son:

1. Configurar IP de ISP/WAN/Public
2. Crear regla de Routeo con el Gateway de ISP/WAN/Public
3. Crear reglas NAT para enmascarar el tráfico de Private/LAN hacia ISP/WAN/Public(Internet)

---

### 1. Configurar IP de ISP/WAN/Public

- En este caso tengo 2 WAN simuladas, pero también utilizo ese de MGMT para la salida de Internet (Es la NAT de GNS3)
- Yo estoy utilizando una del rango que me da mi NAT de gns3 `192.168.30.130/24`, pero aquí la IP debería ser:
    - Opción 1: IP Fija Pública entregada por ISP
    - Opción 2: IP Privada generada por un Firewall o Router superior
    - Opción 3: IP del tango asignado por Router Casero en caso de laboratiorios o redes caseras
    - Opción 4: La IP de X o Y Ruta Layer 3 que haya arriba!!! Osea hacia "afuera" pues! 

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/316804f1-51c9-4647-98b3-52283e4c60d3)


