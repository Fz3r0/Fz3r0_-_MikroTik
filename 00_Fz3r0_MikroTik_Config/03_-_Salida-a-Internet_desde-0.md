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

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/25b5949b-ba17-481f-b465-0ff3e6b2dc3b)

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

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/0e5570f1-f604-4d51-a35f-7435054ed783)

---

### 5. Configuración Interface WAN :: ETH1

1. Ir a la sección **`Interfaces`**
2. Seleccionar para editar **`Ether 1`**
3. Editar Ethernet 1 (WAN), en mi caso:

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/6966dc6f-a11d-4d07-9c1a-f50434eafcb0)

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





