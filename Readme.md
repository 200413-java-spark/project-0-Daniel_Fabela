# PC Part Picker Application

## Example
The purpose of this application is to offer the user the
ability to build his PC from a variety of parts that will be
each organized in its own category:

- CPU
- Motherboard
- GPU
- RAM
- SSD Storage
- HDD Storage
- Power
- Case
- Coolers
- Keaboard & Mouse
- Monitor

Each part will have its specific details and price, and at the end of the program the user will
be able to see the subtotal, tax, and total amount for the PC build.

Expected Input:
// The pc part details will come from files/database so expect a parse method to take in a file
- java PartPicker CPU.csv //For example

Expected Output:
- Subtotal = $_______.
- Taxes = $_______.
- Total Cost = $________.

# Build
- ./build.sh
// mvn clean compile

# Usage
// To run program use ./run.sh
- mvn exec:java
// When files are included
- java PartPicker [filepath]