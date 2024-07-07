# 02 - Init Config después de Hard-Reset

## Recursos

- [Configuración de Mikrotik Desde Cero dar Acceso a Internet](https://www.youtube.com/watch?v=v3Z9PFvrIts)
- [Mikrotik desde cero - DHCP - Interfaces](https://youtu.be/_53hjQtk73M?si=3DAu2lMT07Yiagbp)

## Configuración

### 1. Conectar a ETH2

1. Conectar Entre PC <--> MikroTik por el puerto **`ETH2`**

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/c1342cff-db87-4ac6-8262-71c32cc1153a)

---

### 2. Entrar con MAC o IP default

1. Abrir Winbox
2. Entrar con MAC o  IP default <br><br>
    - User: `admin`
    - Pass: _vacío_

**Opción MAC:**

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/146bf39a-9aac-46d5-857f-f69fd19c4d76)

**Opción IP:**

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/1698aaa0-a32b-4e92-bc07-5fd2dfaba63c)

---

### 3. Borrar la Init-Config-Default

Los MikroTik ya vienen con una pequeña pre-configuración que se debe borrar para configurar completamente desde 0. 

**Opción UI**:

1. Ir a: **`System > Reset Configuration`**
2. Seleccionar la opción `No Default Configuration` y `No Backup`
3. Hacer click en `Reset Configuration`

**Opción CLI**:

1. Entrar a consola de Winbox y escribir el siguiente comando:

````py
system reset-configuration no=yes
````

2. Presionar `y`


