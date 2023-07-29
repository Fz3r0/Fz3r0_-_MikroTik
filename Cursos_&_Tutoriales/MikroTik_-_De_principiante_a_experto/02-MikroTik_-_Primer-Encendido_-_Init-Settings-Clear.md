
## Init Config Clear

El MikroTik siempre trae configs default que aunque se reinicie de fábrica las cargará, a menos que se le de un reinicio de fábrica especial:

1. System > Reset Config:

![image](https://github.com/Fz3r0/Fz3r0_-_MikroTik/assets/94720207/de04c3d9-83ea-4967-8d6c-fabf14c638b4)

2. Ahora la única manera de entrar al MikroTik es via `MAC Address`, debido a que la IP está en blanco `0.0.0.0`

    - `Opcion 1: Via Winbox` - Solo es necesario buscarla desde el Winbox:
    - `Opcion 2: Etiqueta en caja o dispositivo` - También se puede ingresar la MAC que viene en el dispositivo. 

3. Correr el comando `exp` para verificar que la config esté en blanco 

````py
# Muestra todas las configuraciones en MikroTik
exp
````
