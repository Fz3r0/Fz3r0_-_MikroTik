## Instalación inicial

1. Instalar VMware
2. Instalar GNS3

## Config Pro

La finalidad es configurar un GNS3 con IP fija, en modo servidor remoto, es la manera más pro de hacerlo.

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/5ac9dba1-f1fb-47fa-b340-79a94ffb1836)

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/cb3e30c1-43dc-49d8-874b-5007e0583f31)


---

### Settings de GNS3 VM

- Remover una de las interfaces que vienen por default y dejar únicamente 1 como NAT _(Para evitar confusiones en un futuro)_

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/3d7bfd26-efe5-4a05-9d04-ed7e13c750e6)

---

### Iniciar GNS3 Por primera vez

- Entendiendo mejor qué interfaz virtual estoy usando (`192.168.30.xxx` en este caso). Esto en realidad es una red NATeada, es decir, no la IP original de mi computadora maestra. 

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/3213f8b9-2a71-4bd9-9557-e3319abe852f)

- La IP original de mi máquina es esta:

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/797828e3-3ce2-46b0-8375-aede3485c33f)

---

### Configurando Remote Server

Es mejor utilizar el GNS3 como un remote server alojado en la VM, en lugar que local que es como viene por default

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/da4689a4-adf3-494d-9e43-f5d594c2c568)

---

### Update de VM

En caso que se necesite hacer update solo hacer click en el "ok" de la ventana azul y hacer un upgrade con la versión mas reciente _(la de hasta arriba de la lista)_

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/186eea59-f922-440b-b2cc-65a741638e24)

### Inicio Exitoso

Así es como se debe ver el inicio del GNS3 con un servidor remoto:

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/ba83b470-f3e2-430f-a500-9cd0bac08cd4)

























