import serial

port = "/dev/rfcomm0"
stop = "3"
ser = serial.Serial(port,9600)
ser.write(stop)
ser.flushInput()
