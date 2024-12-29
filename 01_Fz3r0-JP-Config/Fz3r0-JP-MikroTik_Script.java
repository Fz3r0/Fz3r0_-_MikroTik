# - - - - - - - - - - - - - - START COPY - - - - - - - - - - - - - - - #
#############################################################################################
#                                                                                           #
#          @@@@@@@@@@@@@@@@@@             ((_.-'- MikroTik Router Generic Config -'-._))    #
#        @@@@@@@@@@@@@@@@@@@@@@@                                                            #
#      @@@@@@@@@@@@@@@@@@@@@@@@@@@           - Configuration for MKT RouterBoard v6+ -      #
#     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@                                                         #
#    @@@@@@@@@@@@@@@/      \@@@/   @      [+] Cyber-Weapon:............. Router Config      #
#   @@@@@@@@@@@@@@@@\  O   @@  @ O @      [+] Version:.................. 2.0                #
#   @@@@@@@@@@@@@ @@@@@@@@@@  | \@@@@@    [+] Author:................... Fz3r0              #
#   @@@@@@@@@@@@@ @@@@@@@@@\__@_/@@@@@    [+] Github:................... github.com/Fz3r0   #
#    @@@@@@@@@@@@@@@/,/,/./´/_|.\`\,\     [+] Twitter:.................. @Fz3r0_OPs         #
#      @@@@@@@@@@@@@|  | | | | | | | |    [+] Youtube:.................. @Fz3r0_OPs         #
#                  \_|_|_|_|_|_|_|_|                                                        #
#                                                                                           #
#############################################################################################
#                                 !!! DISCLAIMER !!!                                        #
#############################################################################################
#                                                                                           #
#        THE AUTHOR ASSUMES NO RESPONSIBILITY OR LIABILITY FOR ANY DAMAGE OR ISSUES         #
#        THAT MAY ARISE FROM THE USE OR MISUSE OF THIS SCRIPT. USE AT YOUR OWN RISK.        #
#                                                                                           #
#############################################################################################
#    ((_.-`-+' Fz3r0 '+-´-._)) MIKROTIK GENERIC HIGH DENSITY NETWORK CONFIGURATION          #
#############################################################################################
# 
#   - THANK YOU FOR USING THIS MIKROTIK CONFIGURATION SCRIPT FOR MALL and RETAIL NETWORKS!
#    
#   - PLEASE READ THE INSTRUCTIONS CAREFULLY BEFORE PROCEEDING. 
#
#   - THIS SCRIPT IS INTENDED FOR MIKROTIK DEVICES AND WAS TESTED SPECIFICALLY ON THE 
#     CCR1009-7G-1C MODEL WITH ROUTEROS VERSION 6.49.7. 
#
#   - THIS SCRIPT INCLUDES SETUP FOR VLANS, IP ADDRESSING, DHCP, DNS, LLDP, 
#     AND VPN SETTINGS FOR OPTIMIZED NETWORK PERFORMANCE IN HIGH DENSITY ENVIRONMENTS.
#
#   - NOTE: MODIFY THE CONFIGURATIONS AS NEEDED FOR YOUR SPECIFIC SETUP. 
#           ALWAYS REVIEW EACH SECTION BEFORE APPLYING! 
#                                                                                          
#############################################################################################
#                               %%% INSTRUCTIONS %%%
#############################################################################################
#
#  :IMPORTANT: DISABLE THE WINDOWS FIREWALL TO AVOID A MAC DISCOVERY LOGIN ISSUES WITH WINBOX
#
#  1- SET DEFAULT SETTINGS FOR MIKROTIK
#
#    (I) HOW TO PERFORM A HARD-RESET ON THE MIKROTIK ("MODEL: RB2011UIAS-2HND-IN"):
#          1. DISCONNECT ALL CONNECTED ETHERNET PORTS.
#          2. TURN OFF THE DEVICE BY UNPLUGGING THE POWER ADAPTER.
#          3. PRESS AND HOLD THE RESET BUTTON WHILE THE MIKROTIK IS POWERED OFF.
#          4. WHILE CONTINUING TO HOLD THE RESET BUTTON, CONNECT THE POWER TO THE MIKROTIK.
#          5. KEEP HOLDING THE RESET BUTTON FOR 5 TO 7 SECONDS.
#
#             % YOU’LL KNOW THE HARD RESET WAS SUCCESSFUL WHEN YOU SEE THE SCREEN SHOWING:
#                  "SECURE YOUR ROUTER / TAP TO HIDE THIS SCREEN"
#                  "USER: ADMIN / PASSWORD(BLANK)"
#                  "LOCAL IP 192.168.88.1"
#
#         !!!IF YOU HOLD THE RESET BUTTON FOR A LONGER PERIOD, OTHER OPTIONS MAY OCCUR, 
#         BUT A HARD RESET WILL NOT BE PERFORMED!!!
#
#    (II) HOW TO ERASE DEFAULT-CONFIGURATION AFTER A HARD-RESET
#         OPTION 1. (UI)  :: SYSTEM > RESET CONFIGURATION > NO DEFAULT CONFIGURATION + DO NOT BACKUP
#         OPTION 2. (CLI) :: "system reset-configuration no=yes"
#
#         - ENTER TO MIKROTIK DEVICE VIA UI WINBOX <"ETH 6 or 7 or 8"> USING MAC ADDRESS
#
#         - ERASE THE DEFAULT CONFIG (YOU WILL BE KICKED OUT OF WINBOX)
#
#         - LOG-IN TO MIKROTIK USING UI WINBOX, AGAIN USING MAC ADDRESSC
#
#         !!!IF YOU CANT SEE ANY MAC ADDRESS, DISABLE WINDOWS FIREWALL!!!
#
#
#  2- EDIT THis SCRIPT BEFORE PASTING!!!
# 
#     % CHECKLIST FOR EDITION:
#          1. CHANGE HOSTNAME 
#          2. CHECK THE IP FOR THE VPN YOU WILL USE AND ADD IT TO THE VPN SECTION
#
#  3- PASTE SCRIPT IN MIKROTIK CLI TERMINAL, PRESS ENTER, AND WAIT UNTIL THE PROCESS ENDS
#
#  5- CHECK FOR RESULTS IN MIKROTIK UI VIA WINBOX
#
#  6- :IMPORNTANT: ONCE YOU HAVE FINISHED COPYING THE SCRIPT, GO TO UI > IPSEC > ENABLE VPN
#
#  7- ENJOY!!!
#
#############################################################################################
#  + ENDING PHYSICAL CONFIGURATION
#############################################################################################
#
#  << WAN >>  
#
#    % ETHERNET 1  =  WAN-1 / ISP-1
#
#    % ETHERNET 2  =  WAN-2 / ISP-2
#
#  << LAN BRIDGE >>  
#
#    % ETHERNET 3  =  LAN (MANAGEMENT + VLANS [for switches & aps]) <<[BRIDGE LAN]>>
#
#    % ETHERNET 4  =  PC-1                                          <<[BRIDGE LAN]>>
#
#    % ETHERNET 5 =   AP-1                                          <<[BRIDGE LAN]>>
# 
#############################################################################################
#  + SYSTEM ID
#############################################################################################
#
/system identity
#
set name="MKT_F0-JP_SITE-A"
#
#############################################################################################
#  + SYSTEM NOTE
#############################################################################################
#
/system note
#
set show-at-login=yes
set note="\r\
    \n\r\
    \n\r\
    \n\r\
    \n\r\
    \n\r\
    \n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\r\
    \n    F Z 3 R O  -  J U R A S S I C  P A R K  -  S I T E  A    \r\
    \n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\r\
    \n\r\
    \n\r\
    \n>> VENUE: MKT_F0-JP_SITE-A \r\
    \n\r\
    \n>> PROPERTY OF Fz3r0 - AUTHORIZED PERSONNEL ONLY\r\
    \n\r\
    \n>> UNAUTHORIZED ACCESS TO THIS DEVICE IS STRICTLY PROHIBITED. \r\
    \n\r\
    \n\r\
    \n"
#    
#############################################################################################
#  + INTERFACES
#############################################################################################
#
/interface ethernet
#
# % - WAN-1 = ETHERNET 1 [physical]
set [ find default-name=ether1 ] comment=">>>>   WAN-1_ISP1-eth1"    name=WAN1_ether1
#
# % - WAN-2 = ETHERNET 2 [physical]
set [ find default-name=ether2 ] comment=">>>>   WAN-2_ISP2-eth2"    name=WAN2_ether2
#
# % - LAN   = ETHERNET 3 [physical]
set [ find default-name=ether3 ] comment=">> LAN-BRIDGE-eth3"        name=LAN_ether3
#
# % - PC-1  = ETHERNET 4  [physical]
set [ find default-name=ether4 ] comment=">> PC-ADMINISTRATOR-eth4"  name=EXTRA1_ether4
#
# % - AP-1  = ETHERNET 5  [physical]
set [ find default-name=ether5 ] comment=">> AP-1-eth5"              name=EXTRA2_ether5
#
#############################################################################################
#  + BRIDGE (for LAN interfaces)
#############################################################################################
#
#  :IMPORTANT: ONLY LAN PORTS ARE ADDED TO THE BRIDGE!!! EXCLUDE ANY WAN!!!
#
# + LAN-BRIDGE CREATION:
#
/interface bridge
#
add comment=">>>>   LAN-BRIDGE-eth3 (Bridge)"                        name=LAN_BRIDGE_@_ether3
#
# + INSERT LAN , PC-ADMINISTRATOR , AP into -> LAN_BRIDGE_@_ether3:
#
/interface bridge port
#
add bridge=LAN interface=LAN_ether3
add bridge=LAN interface=EXTRA1_ether4
add bridge=LAN interface=EXTRA2_ether5
#
#############################################################################################
#  + VLANS 
#############################################################################################
#
# :IMPORTANT: VLANS GOES INTO LAN_BRIDGE_@_ether3 (not LAN_ether3)
#
/interface vlan
#
add interface=LAN_BRIDGE_@_ether3 name=vlan10-MANAGEMENT                 vlan-id=10
add interface=LAN_BRIDGE_@_ether3 name=vlan50-ALFA_OPEN                  vlan-id=50
add interface=LAN_BRIDGE_@_ether3 name=vlan60-BRAVO_WPA2-PSK             vlan-id=60
add interface=LAN_BRIDGE_@_ether3 name=vlan70-CHARLIE_802.1X-PEAP        vlan-id=70
add interface=LAN_BRIDGE_@_ether3 name=vlan80-DELTA_HOTSPOT-WISPr        vlan-id=80
add interface=LAN_BRIDGE_@_ether3 name=vlan90-ECHO_HOTSPOT2.0-PASSPOINT  vlan-id=90
add interface=LAN_BRIDGE_@_ether3 name=vlan66-HONEYPOT                   vlan-id=66
#
#############################################################################################
#  + IP ADDRESSES , DHCP SERVER , IP POOLS 
#############################################################################################
#
# % IP PLAN EXAMPLE (MANAGEMENT)    << 254 ADDRESSES >>
#
#  Address:   10.10.0.1             00001010.00001010.00000000 .00000001
#  Netmask:   255.255.255.0 = 24    11111111.11111111.11111111 .00000000
#  Wildcard:  0.0.0.255             00000000.00000000.00000000 .11111111
#  =>
#  Network:   10.10.0.0/24          00001010.00001010.00000000 .00000000 (Class A)
#  Broadcast: 10.10.0.255           00001010.00001010.00000000 .11111111
#  HostMin:   10.10.0.1             00001010.00001010.00000000 .00000001
#  HostMax:   10.10.0.254           00001010.00001010.00000000 .11111110
#  Hosts/Net: 254                   (Private Internet)
#
# % IP PLAN EXAMPLE (VLANs)   << 65,534 ADDRESSES >>
#   
#  Address:   10.50.0.0             00001010.00010100 .00000000.00000000
#  Netmask:   255.255.0.0 = 16      11111111.11111111 .00000000.00000000
#  Wildcard:  0.0.255.255           00000000.00000000 .11111111.11111111
#  =>
#  Network:   10.50.0.0/16          00001010.00010100 .00000000.00000000 (Class A)
#  Broadcast: 10.50.255.255         00001010.00010100 .11111111.11111111
#  HostMin:   10.50.0.1             00001010.00010100 .00000000.00000001
#  HostMax:   10.50.255.254         00001010.00010100 .11111111.11111110
#  Hosts/Net: 65534                 (Private Internet)
#
#############################################################################################
#
#############################
# + IP ADDRESSES:
#############################
#
/ip address
#
# << LAN >>
#
# % MANAGEMENT PHYSICAL INTERFACES:
add address=10.10.0.1/24  interface=LAN_ether3                        network=10.10.0.0
add address=10.10.0.2/24  interface=EXTRA1_ether4                     network=10.10.0.0
add address=10.10.0.3/24  interface=EXTRA2_ether5                     network=10.10.0.0
#
# << VLANs >>
#
# % VIRTUAL LAN INTERFACES @ LAN_ether3:
add address=10.50.0.1/16  interface=vlan50-ALFA_OPEN                  network=10.50.0.0
add address=10.60.0.1/16  interface=vlan60-BRAVO_WPA2-PSK             network=10.60.0.0
add address=10.70.0.1/16  interface=vlan70-CHARLIE_802.1X-PEAP        network=10.70.0.0
add address=10.80.0.1/16  interface=vlan80-DELTA_HOTSPOT-WISPr        network=10.80.0.0
add address=10.90.0.1/16  interface=vlan90-ECHO_HOTSPOT2.0-PASSPOINT  network=10.90.0.0
add address=10.66.0.1/16  interface=vlan66-HONEYPOT                   network=10.66.0.0
#
# << WANs >>
#
# !OPTION 1!: USING DHCP FOR WANS
#
/ip dhcp-client
#
add disabled=no interface=WAN1_ether1
add disabled=no interface=WAN2_ether2
#
# !OPTION 2!: USING STATIC IP FOR WANS #COMMENTED#
#
#/ip address
#
#add address=192.168.100.254/24  interface=WAN1_ether1  network=192.168.100.0
#add address=192.168.200.254/24  interface=WAN2_ether2  network=192.168.200.0
#
#############################
# + IP POOL:
#############################
#
/ip pool
#
# % "184 of 254 IPS available for MANAGEMENT DHCP":
# % "First 70 IP Addresses are reserved for static Switches, Servers, Gateway, etc"
add name=vlan10-MANAGEMENT-pool                 ranges=10.10.0.70-10.10.0.254
#
# % "1,742 of 65,534 IPS available for each VLAN":
add name=vlan50-ALFA_OPEN-pool                  ranges=10.50.0.10-10.50.6.255
add name=vlan60-BRAVO_WPA2-PSK-pool             ranges=10.60.0.10-10.60.6.255
add name=vlan70-CHARLIE_802.1X-PEAP-pool        ranges=10.70.0.10-10.70.6.255
add name=vlan80-DELTA_HOTSPOT-WISPr-pool        ranges=10.80.0.10-10.80.6.255
add name=vlan90-ECHO_HOTSPOT2.0-PASSPOINT-pool  ranges=10.90.0.10-10.90.6.255
add name=vlan66-HONEYPOT-pool                   ranges=10.66.0.10-10.66.6.255
#
#############################
# + DHCP SERVER:
#############################
#
# :IMPORTANT: THE DHCP SERVER FOR THE MANAGEMENT LAN IS THE << LAN-BRIDGE >> (NOT EHTERNET 3 VLAN-1)
#
/ip dhcp-server
#
# << MANAGEMENT >>
#
add address-pool=vlan10-MANAGEMENT-pool                 disabled=no  interface=LAN_BRIDGE_@_ether3              lease-time=24h  name=vlan10-MANAGEMENT-dhcp
#
# << VLANS >>
#
add address-pool=vlan50-ALFA_OPEN-pool                  disabled=no  interface=vlan50-ALFA_OPEN                  lease-time=3h  name=vlan50-ALFA_OPEN-dhcp
add address-pool=vlan60-BRAVO_WPA2-PSK-pool             disabled=no  interface=vlan60-BRAVO_WPA2-PSK             lease-time=3h  name=vlan60-BRAVO_WPA2-PSK-dhcp
add address-pool=vlan70-CHARLIE_802.1X-PEAP-pool        disabled=no  interface=vlan70-CHARLIE_802.1X-PEAP        lease-time=3h  name=vlan70-CHARLIE_802.1X-PEAP-dhcp
add address-pool=vlan80-DELTA_HOTSPOT-WISPr-pool        disabled=no  interface=vlan80-DELTA_HOTSPOT-WISPr        lease-time=3h  name=vlan80-DELTA_HOTSPOT-WISPr-dhcp
add address-pool=vlan90-ECHO_HOTSPOT2.0-PASSPOINT-pool  disabled=no  interface=vlan90-ECHO_HOTSPOT2.0-PASSPOINT  lease-time=3h  name=vlan90-ECHO_HOTSPOT2.0-PASSPOINT-dhcp
add address-pool=vlan66-HONEYPOT-pool                   disabled=no  interface=vlan66-HONEYPOT                   lease-time=3h  name=vlan66-HONEYPOT-dhcp
#
#############################
# + DHCP NETWORKS FOR DHCP OFFER
#############################
#
/ip dhcp-server network
#
# << MANAGEMENT >>
#
add address=10.10.0.0/24 comment=vlan10-MANAGEMENT                 dns-server=8.8.8.8,1.1.1.1 gateway=10.10.0.1
#
# << VLANS >>
#
add address=10.50.0.0/16 comment=vlan50-ALFA_OPEN                  dns-server=8.8.8.8,1.1.1.1 gateway=10.50.0.1
add address=10.60.0.0/16 comment=vlan60-BRAVO_WPA2-PSK             dns-server=8.8.8.8,1.1.1.1 gateway=10.60.0.1
add address=10.70.0.0/16 comment=vlan70-CHARLIE_802.1X-PEAP        dns-server=8.8.8.8,1.1.1.1 gateway=10.70.0.1
add address=10.80.0.0/16 comment=vlan80-DELTA_HOTSPOT-WISPr        dns-server=8.8.8.8,1.1.1.1 gateway=10.80.0.1
add address=10.90.0.0/16 comment=vlan90-ECHO_HOTSPOT2.0-PASSPOINT  dns-server=8.8.8.8,1.1.1.1 gateway=10.90.0.1
add address=10.66.0.0/16 comment=vlan66-HONEYPOT                   dns-server=8.8.8.8,1.1.1.1 gateway=10.66.0.1
#
#############################################################################################
#  + DNS
#############################################################################################
#
/ip dns
set allow-remote-requests=yes servers=8.8.8.8,1.1.1.1
#
#############################################################################################
#  + SSH ALLOW 
#############################################################################################
#
/ip ssh
set allow-none-crypto=yes forwarding-enabled=remote
#
#############################################################################################
#  + DISCOVERY PROTOCOLS & NEIGHBOR REPORT (LLDP,CDP,MNDP):
#############################################################################################
#
/ip neighbor discovery-settings
set discover-interface-list=!dynamic
#
#############################################################################################
#  + NAT & ROUTING (ACTIVATE INTERNET SERVICE FOR THE LAN & VPN CONNECTION)
#############################################################################################
#
# :IMPORTANT: USE THE SAME IP ADDRESS USED BY IPSEC VPN CLIENT FOR SOURCE ADDRESS (EG. 172.16.38.19)
#
/ip firewall nat
#
# % NAT FOR VPN IPSEC !10.10.0.0/22 IS THE REMOTE VPN SERVER NETWORK - DO NOT CONFUSE WITH THIS MIKROTIK!
#
add action=accept chain=srcnat dst-address=10.10.0.0/22 src-address=172.16.38.19
#
# % NAT FOR LAN/VLANS INTERNET WAN1_ether1 & WAN2_ether2
#
add action=masquerade chain=srcnat out-interface=WAN1_ether1
add action=masquerade chain=srcnat out-interface=WAN2_ether2
#
#############################################################################################
#  + ADMIN , USERS , PASSWORDS
#############################################################################################
#
#/user add       name=Fz3r0 group=full password=mikro123 
#
#/user set [find name=admin]           password=mikro123
#
#############################################################################################
#  + FINISH!!!
#############################################################################################
# - - - - - - - - - - - - - - - END COPY - - - - - - - - - - - - - - - #

    
