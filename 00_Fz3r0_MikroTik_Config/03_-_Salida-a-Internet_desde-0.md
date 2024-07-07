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

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/cfd032e1-06ca-47ad-9319-27126cf9fc0a)

### 3. Configuración Interface WAN :: ETH1

1. Ir a la sección **`Interfaces`**
2. Seleccionar para editar **`Ether 1`**
3. Editar Ethernet 1, en mi caso:

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/d5b33fc6-e496-46fb-9b5a-e898bb481ad6)







