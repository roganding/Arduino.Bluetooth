import serial

port = "/dev/rfcomm0"
back = "5"
ser = serial.Serial(port,9600)
ser.write(back)
ser.flushInput()
