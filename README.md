# PC-CONNECT
Allows Android users to control their PC using Mobile Phone. Also transfer Files from PC to Mobile and Vice Versa. USES SOCKET PROGRAMMING IN PYTHON AND JAVA
![alt tag](https://3.bp.blogspot.com/-iuHYHxHWw2o/WGeh4htkAuI/AAAAAAAAAl8/-u4O7xTNGm4QFo2OFoWRreBGvnjJAgpqQCLcB/s1600/Untitled-61.png)

APP SCREENSHOTS


This app has been designed to allow users to control their PC/Laptops using their Mobile Phones.
It allows following functionalities:

1. CONTROL PC using MOBILE PHONE

It allows users to create a virtual Mouse that allows users to move their fingers on Mobile phone while the mouse pointer on the PC moves. This will allow users to control their PC even if they are a few meters away as like when to deliver a presentation etc. The app also allows users to Play/Pause music of their choice on PC and control the songs like next, previous ,mute etc from the app itself.
Think if you are playing songs on Laptop and it is placed on table away from your bed, then you can control it without moving from your bed.


2. MOBILE To PC Transfer

This app allows users to transfer any file(JPEG/PDF/WORD/CONTACT etc) from their mobile phone to PC instantly without any Bluetooth connection or any use of Data Cable. The user needs to have a small software(Link below) and just select a file to be transferred and it will be available in few milliseconds.

3. PC to MOBILE Transfer

Users can also transfer files from their PC to Phone instantly. The file transferred will be available in a folder named PC CONTROL in the External Storage of the phone which can be seen in the File Manager app.

CONCEPTS USED:

The PC CONTROL APP has been created on Android Studio 2.2.1. It uses concepts of Socket Programming. The software for PC have been created using JAVA and Python and have been converted into .exe Applications. It is based on the fact that the PC and Mobile Phone should be connected to same WiFi or the PC should be connected to the Hotspot of the Phone. Having done so, rest all is handled by the app and software as well. The source code of the app and software is Open Source on the following Github Repository. Any updates/modifications to it are most welcome.


HOW TO USE:

1. Download the Mobile app from Google Playstore.
2. Download the software on PC from the following Link.
LINK TO PC SOFTWARE
3. Make sure your Phone and Pc is connnected to same hotspot zone /Wifi.
3. Run the App. It will ask for the IP Address and Socket Number.
4. Run the PcIP App in the software downloaded for PC from Point no 2. It will return the IP Address. Type that IP Address to your Mobile App.
5. Type any four digit number as PORT Number. Remember this no as it will be used further.

I. FOR PC CONTROL 

1. Press the Connect Button on Top corner of the app to establish Connection. It will show message 'Connected to Server'.
2. Move your fingers on the blue screen and you will see your Mouse Pointer on PC also moves. Hence you can now control your PC through Phone.
3. If you play Music say using VLC Media Player, then if you press 'NEXT' button, next song will be played and so on all the buttons work. 

II. FOR MOBILE TO PC TRANSFER

1. Run the MOBILE TO PC Software on PC and then enter the IP Address and any port Number. 
2. Select MOBILE TO PC tab from Android app and then tap on GREEN UPLOAD ICON.
3. Select the File on the phone to be transferred.
4. The File reaches the directory where the Software is present.

III. FOR PC TO MOBILE TRANSFER

1. Select PC TO MOBILE tab from Android App and then tap on BLUE COLOR DOWNLOAD button.
2. Run PC to MOBILE software and Enter the PORT NUMBER.
3. Select the File to be transferred.
4. The File reaches in the folder PC CONNECT of the Mobile Phone.

Please refer following video for more details.



