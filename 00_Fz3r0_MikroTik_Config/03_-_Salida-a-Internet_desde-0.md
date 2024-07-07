# 03 - Salida a Internet desde 0

## Recursos

- [Configuración de Mikrotik Desde Cero dar Acceso a Internet](https://www.youtube.com/watch?v=v3Z9PFvrIts)
- [Mikrotik desde cero - DHCP - Interfaces](https://youtu.be/_53hjQtk73M?si=3DAu2lMT07Yiagbp)

## Configuración

### 1. Conectar a ETH2

1. Conectar Entre PC <--> MikroTik por el puerto **`ETH2`**

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/c1342cff-db87-4ac6-8262-71c32cc1153a)

---

### 2. Entrar con MAC

_Solo se puede entrar con MAC ya que hemos borrado la IP previamente_

1. Abrir Winbox
2. Entrar con MAC
    - User: `admin`
    - Pass: _vacío_

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/3b623e8f-5cd1-48d8-b62c-5da8a60d22ba)

---

### 3. Ingresar nuevo password de admin

Al ingresar solicitará agregar un nuevo password, en este caso utilicé:

- User: `admin`
- Pass: `mikro123`

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/0e5570f1-f604-4d51-a35f-7435054ed783)

---

### 4. Configuración Interface WAN :: ETH1

1. Ir a la sección **`Interfaces`**
2. Seleccionar para editar **`Ether 1`**
3. Editar Ethernet 1 (WAN), en mi caso:

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/6966dc6f-a11d-4d07-9c1a-f50434eafcb0)

---

### 5. Configuración Interface LAN :: ETH2

1. Ir a la sección **`Interfaces`**
2. Seleccionar para editar **`Ether 2`**
3. Editar Ethernet 2 (LAN), en mi caso:

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/39fddfb3-a0d2-49f9-aa6e-df1681efbca5)







