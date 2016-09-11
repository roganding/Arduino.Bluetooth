import serial

port = "/dev/rfcomm0"
left = "2"
ser = serial.Serial(port,9600)
ser.write(left)
ser.flushInput()
