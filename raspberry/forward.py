import serial

port = "/dev/rfcomm0"
forward = "1"
ser = serial.Serial(port,9600)
ser.write(forward)
ser.flushInput()
