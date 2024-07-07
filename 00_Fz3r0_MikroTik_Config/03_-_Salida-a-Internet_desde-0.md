# 03 - Salida a Internet desde 0

## Recursos

- [Configuración de Mikrotik Desde Cero dar Acceso a Internet](https://www.youtube.com/watch?v=v3Z9PFvrIts)
- [Mikrotik desde cero - DHCP - Interfaces](https://youtu.be/_53hjQtk73M?si=3DAu2lMT07Yiagbp)

## Configuración

### 1. Conectar LAN a ETH2

1. Conectar Entre PC <--> MikroTik por el puerto **`ETH2`**

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/c1342cff-db87-4ac6-8262-71c32cc1153a)

---

1. Conectar Entre Router / Módem <--> MikroTik por el puerto **`ETH1`**

### 2. Conectar WAN a ETH1

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/435ba66b-2dc4-40c6-b5c8-18160c9666c6)

---

### 3. Entrar con MAC

_Solo se puede entrar con MAC ya que hemos borrado la IP previamente_

1. Abrir Winbox
2. Entrar con MAC
    - User: `admin`
    - Pass: _vacío_

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/3b623e8f-5cd1-48d8-b62c-5da8a60d22ba)

---

### 4. Ingresar nuevo password de admin

Al ingresar solicitará agregar un nuevo password, en este caso utilicé:

- User: `admin`
- Pass: `mikro123`

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/cfd032e1-06ca-47ad-9319-27126cf9fc0a)

---

### 5. Configuración Interface WAN :: ETH1

1. Ir a la sección **`Interfaces`**
2. Seleccionar para editar **`Ether 1`**
3. Editar Ethernet 1 (WAN), en mi caso:

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/0e5570f1-f604-4d51-a35f-7435054ed783)

---

### 6. Configuración Interface LAN :: ETH2

1. Ir a la sección **`Interfaces`**
2. Seleccionar para editar **`Ether 2`**
3. Editar Ethernet 2 (LAN), en mi caso:

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/39fddfb3-a0d2-49f9-aa6e-df1681efbca5)

---

### 7. Asignar IPs a LAN y WAN

Primero asignaré la IP de la WAN:

1. Ir a la sección **`IP > Addresses`**
2. Dar click en `+` y asignar la IP de la `WAN` _(Se utiliza una IP dependiendo del Router / Módem Internet, es mi caso el Telmex es `192.168.1.254/24` así que utilizaré la: `192.168.1.1/24`)_
3. Asignar la IP de la red aunque también se puede poner automáticamente una vez asignando la IP de la interfaz _(En mi caso `192.168.1.0`)_
4. Agregar comentarios.

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/c10913f7-9ec8-4666-bbc7-8c120d751461)

Ahora asignaré la IP de la LAN:

1. Ir a la sección **`IP > Addresses`**
2. Dar click en `+` y asignar la IP de la `LAN` _(En mi caso utilizaré la subnet 10.10.0.0/16)_
3. Asignar la IP de la red aunque también se puede poner automáticamente una vez asignando la IP de la interfaz _(En mi caso `10.10.0.0`)_
4. Agregar comentarios.

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/bd399f9b-343c-48c0-82d6-47c691c66acb)

Subnet utilizada para LAN:

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/08f1ba91-afc1-4f9f-ab0b-3e49df456f28)

---

### 8. Crear NAT

El NAT se crea para poder enviar el tráfico desde LAN hacia la WAN (Internet)

1. Ir a la sección **`IP > Firewall > NAT`**
2. En la pestaña `General` y opción `Chain` seleccionar: **`srcnat`**
3. En la opción `Out. Interface` seleccionar la `WAN`

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/68167832-2f25-43f9-ac03-5b773d442938)

4. En la pestaña `Action` y opción `Action` seleccionar: **`masquerade`**
5. Añadir comentarios

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/eb24e9c5-711a-43a2-b503-9affb0b8cbd6)

---

### 9. Configurar DNS

1. Ir a la sección **`IP > DNS`**
2. Agregar los servidores DNS a placer, en mi caso: <br><br>
    - `1.1.1.1` _(Cloud Flare Primary)_
    - `1.0.0.1` _(Cloud Flare Secondary)_
    - `8.8.8.8` _(Google Primary)_
    - `8.8.4.4` _(Google Secondary)_ <br><br>
3. Dar check a la opción `Allow Remote Request`

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/27cbb5a1-b285-495d-ba87-056dba93b209)

---

### 10. Configurar Default Static Route

Es importante utilizar la IP del ISP/Router/Módem que se está utilizando, en mi caso es la IP de Telmex: `192.168.1.254`

1. Ir a la sección **`IP > Routes`**
2. Agregar la IP del ISP/Router/Módem en la opción de `Gateway`
3. Agregar comentarios
4. Aplicar

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/33b037b6-7dda-427b-a43d-96135016706a)

---

### 11. Verificar que haya salida a Internet

Debido a que no se ha configurado DHCP se debe agregar una IP manual a la PC de prueba:

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/d20be482-9166-4225-b223-e247c097d483)

1. Hacer ping a cualquier página o IP en Internet desde la PC en LAN:

