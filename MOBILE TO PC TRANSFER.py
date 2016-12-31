#!C:/Python27/python
from Tkinter import *
import tkMessageBox
import Tkinter
import socket,sys,os

def handleclient2(conn,filename):
    
    
   ## filename='temp'
    with open(filename, 'wb') as f:
        
        
        print ('file opened')
        while True:
            print('receiving data...')
            
            data = conn.recv(102400)
            if not data:
                break
                    # write data to a file
            f.write(data)
            print ("Received")
        f.close()
    conn.close()    



root = Tkinter.Tk()
root.title("Mobile to PC")
root.geometry("300x300")

Lbl1 = Label(root, text="Enter IP:")
Lbl1.pack(side=TOP,padx=5,pady=5)
Entry1 = Entry(root, bd =1)
Entry1.pack(side=TOP,padx=5,pady=5)


Lbl2 = Label(root, text="Enter PORT:")
Lbl2.pack(side=TOP,padx=15,pady=15)
Entry2 = Entry(root, bd =1)
Entry2.pack(side=TOP,padx=15,pady=15)
host=""
port=0

def PrintCommand():
    print(Entry1.get())
    host=Entry1.get()
    print(Entry2.get())
    port=int(Entry2.get())
    root.destroy()
    print port
    print host

    s=socket.socket()

    s.bind((host,port))
    s.listen(5)
    print ("\nMake Sure you are on Common Hotspot Zone %s" % host)
    print ("Waiting to receive Image")
    conn,addr=s.accept()
    print ('connected to ',addr)
    filename=conn.recv(1024)
    print ("filename=%s" %filename)
    handleclient2(conn,filename)

    


bttn1 = Tkinter.Button(root, text ="print command", command = PrintCommand)
bttn1.pack(side = TOP,padx=10,pady=20)



    

root.mainloop()
#port=8999
#host="192.168.43.239"
