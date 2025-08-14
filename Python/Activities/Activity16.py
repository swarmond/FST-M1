# Classes of Cars
# Create a car class with the following details:
# Properties: manufacturer, model, make, transmission, color
# Methods: accelerate(), stop()
# accelerate() should print "{Manufacturer} {Model} is moving"
# stop() should print "{Manufacturer} {Model} has stopped"
# Using this car class, create 3 different car objects.

class Car:
    'This class represents Car'
    def __init__(self, manufaturer, model, make, transmission, color):
        self.manufacturer = manufaturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer + " " + self.model + " " + "is moving")
    
    def stop(self):
        print(self.manufacturer + " " + self.model + " " + "has stopped")

car1 = Car("Hyundai", "EON", "2020", "Manual", "Blue")
car2 = Car("Hyundai", "NIOS", "2021", "Manual", "White")
car3 = Car("Hyundai", "Creta", "2024", "Automatic", "Black")

car1.accelerate()
car1.stop()

car2.accelerate()
car2.stop()

car3.accelerate()
car3.stop()