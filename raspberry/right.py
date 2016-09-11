import serial

port = "/dev/rfcomm0"
right = "4"
ser = serial.Serial(port,9600)
ser.write(right)
ser.flushInput()
