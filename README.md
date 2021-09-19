# me_hack
Back in 2015 I was given as a gift a baby monitoring camera by Motorola (this one: https://baby.checklist.com/baby-monitors/motorola-blink1), which was being configured
by a phone app to be globally accessible through the internet, after it was connected to home WiFi. So that I could be at work and have a window in my PC open watching my wife
changing the baby's diapers. Since same would be possible for anyone caring enough to hack into the camera video feed, quite soon I removed it and substituted its utility by 
actually walking in the baby room from time to time to see how it was doing...

Flash forward to 2021, where my now 6-years old son discovered this camera in a drawer and wanted badly to see how it was working. Since he went as far as even locating online
its manual (https://www.manualslib.com/manual/645899/Motorola-Blink1.html), I decided to give it a try and re-install the app called Monitor Everywhere. My vague
recollection of it being totally crap was soon proven right, since right after installing it I spent couple of minutes staring the vintage 2012-style spinning progress indicator 
only to eventually get an app crash because of connection failure. WTF-- what a terrible failure, and dissapointment for my son! 

## Getting hold of camera API

Since the camera, after having it reset, seemed indeed to successfully entering initialization phase (its private WiFi network was open and accessible), the problem was clearly
with the app. Moreover by http-accessing with Chrome the LAN gateway it was providing I was getting a 400 (Bad Request) error code, clear indication that there was some sort of
high-level web API which should be able to be accessed even outside the app. But where to find it?

Searching on internet provided some hints, but nothing on how actually to initialize the camera so it actually starts providing a feed. However there is an additional authoritative
source of API documentation... the app itself! As well known, most of Android apps can be decompiled beck to Java to a satisfactory degree, and this is how I managed to get
initial access to the camera API. That investigation also showed that app was actuially crashing because it could not establish connection with <code>monitoreverywhere.com</code>-- I don't know if 
this server is down for good, therefore rendering the camera unusable, or it is just experiencing a temporary downtime.

After spending some hours isolating the interesting parts of the decompiled app and stubbing the non-essential functionality for accessing the API, I eventually
came up with this little program to allow setting up the camera and turning on its feed. Added bonus is that it is no longer necessary to route the feed through Motorola
servers-- we can have the camera totally isolated in our LAN, and make sure we do not make life so easy to everyone wishing to hack his way into our home...

## Hacking into the camera

In a nutshell, here is how to do it:

1. Reset the camera, as described in the manual above (chapter 3.1)
2. Connect to <code>Camera-XXXX</code> SSID
3. Run the program, suppling at the same time the SSID and password of your WiFi network. Upon completion, the camera will make a long beep signaling it is connected to home WiFi
4. You can connect back to home WiFi as well, camera API is now accessible over http. You can retrieve still images from its feed by hitting 
<code>http://(camera IP)/?action=snapshot</code> e.g. from Chrome.
5. Additional API functionality is documented (well, sort of...) in <code>com.msc3.PublicDefine.java</code>, feel free to experiment!
