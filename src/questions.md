Question:
1. Why can the same report loop handle both subclasses?
Because both ProgrammingWorkshop and RoboticsWorkshop inherit from Workshop. 
Through polymorphism, the same loop can access their shared methods while using their different fees

2. Why must request B preserve the existing state?
Because Request B asks for 3 seats when only 2 are available. 
Since the reservation is rejected, the existing enrollment must remain unchanged

3. How do an invalid workshop number and a valid workshop with insufficient space differ?
An invalid workshop number means the workshop doesn't exist in the array. Insufficient space means the workshop exists,
but there aren't enough available seats to accept the reservation