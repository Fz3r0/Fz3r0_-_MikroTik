# 03 - Salida a Internet desde 0

## Recursos

- [Cow to Block/Filter website MikroTik](https://www.youtube.com/watch?v=dNswOyvLT4w)

## Configuración

### 1. Crear Regla para filtrar lichess.org

1. En la pestaña `IP>Firewall >>Layer 7 Protocols` crear una nueva rega `+`.
2. Usar las expresiones `^.+(lichess.org).*$`
3. Aplicar

![image](https://github.com/user-attachments/assets/10c12666-53a3-49b3-a397-e29e8b3a9839)

---

### 2. Crear Filter Rules: No URL

1. En la pestaña `General` agregar la subnet de la LAN/VLAN donde se bloqueará la IP / URL

![image](https://github.com/user-attachments/assets/da98050c-cba4-466e-a7e5-c6c73cb0064b)

2. En la pestaña `Advanced` agregar Regla creada en el paso anterior

![image](https://github.com/user-attachments/assets/ccbfedd8-353c-4164-a157-19f2997a7193)

3. En la pestaña `Action` selecciónar `drop` (Aquí también se puedes usar otras acciones para otro tipo de propósitos)

![image](https://github.com/user-attachments/assets/0763f500-7290-442b-bf53-ff7615156ee7)

---

### 3. Crear Filter Rules: Np IP

1. En la pestaña `Address List` un objeto de la IP de lichess.org

![image](https://github.com/user-attachments/assets/00a03dca-ccdf-4dce-a492-43bc9d37cb55)

2. En la pestaña `Advanced` agregar Regla creada en el paso anterior

![image](https://github.com/user-attachments/assets/517d12be-33dc-4ae5-b5cb-e938406b373f)

3. En la pestaña `Action` selecciónar `drop` (Aquí también se puedes usar otras acciones para otro tipo de propósitos)

![image](https://github.com/user-attachments/assets/0763f500-7290-442b-bf53-ff7615156ee7)

---

### 4. Validar Configuración

- Cuando se intenta navegar en la página ya no abrirá, incluyendo dominios y subdominios

![image](https://github.com/user-attachments/assets/74699f92-2b68-4426-9ac4-0aac86a9af3c)










