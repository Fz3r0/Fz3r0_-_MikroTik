## Salida a Internet

Los 3 pasos de configuración para salir a Internet de LAN @ WAN son:

1. Configurar IP de ISP/WAN/Public
2. Crear regla de Routeo con el Gateway de ISP/WAN/Public
3. Crear reglas NAT para enmascarar el tráfico de Private/LAN hacia ISP/WAN/Public(Internet)

---

### 1. Configurar IP de ISP/WAN/Public

- En este caso tengo 2 WAN simuladas, pero también utilizo ese de MGMT para la salida de Internet (Es la NAT de GNS3)
- Yo estoy utilizando una del rango que me da mi NAT de gns3 `192.168.30.130/24`, pero aquí la IP debería ser: <br><br>
    - `Opción 1`: IP Fija Pública entregada por ISP
    - `Opción 2`: IP Privada generada por un Firewall o Router superior
    - `Opción 3`: IP del tango asignado por Router Casero en caso de laboratiorios o redes caseras
    - `Opción 4`: La IP de X o Y Ruta Layer 3 que haya arriba!!! Osea hacia "afuera" pues! 
<br>

### `Usando IP Estática:`

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/41ad5448-55da-42dd-b7ea-f9c2ada29049)

### `Usando DHCP:`

- En este caso solo hay que crear un `DHCP Client` utilizando la interfaz necesaria.
- OJO! Es por eso hay una `D` de `Dynamic` en la IP ;)

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/82319b1b-5512-45dc-8038-6da8591bbe60)

---

### 2. Crear regla de Routeo con el Gateway de ISP/WAN/Public

- **En caso de usar `DHCP` se pondrá la default route sola, y de hecho se puede activar o desactivar en el DHCP Client.**
- **En caso de usar `IP Estática`, pasar al paso 2**

Para este ejemplo lo desactivaré para poner la Default Route de manera manual para que sea lo más cercano a una IP estática de un ISP:

### 1. Quitando la Static Route del DHCP Client

- Solo cambiar a `no` el default que viene en el DHCP Client:

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/6d90f574-75a1-4978-a790-2cb21af778bf)

### 2. Crear Regla de Routeo


