package lldquestions.parkinglot.model;

import lldquestions.parkinglot.model.gate.EntranceGate;
import lldquestions.parkinglot.model.gate.EntranceGateImpl;
import lldquestions.parkinglot.model.vehicle.Vehicle;
import lldquestions.parkinglot.model.vehicle.VehicleType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        EntranceGate entranceGate = new EntranceGateImpl();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String input = reader.readLine();
            String[] values = input.split("@");
            String command = values[0];
            String vehicleNumber = values[1];
            VehicleType vehicleType = VehicleType.valueOf(values[2]);
            if ("ENTRY".equals(command)) {
                Ticket ticket = entranceGate.parkVehicleAndGetTicket(new Vehicle(vehicleNumber, vehicleType));
                System.out.println(ticket);
            } else if ("EXIT".equals(command)) {
                entranceGate.leave(new Vehicle(vehicleNumber, vehicleType));
            }
        }
    }
}

//ENTRY@KA-01-EQ-1316@TWO_WHEELER
//ENTRY@KA-01-EQ-0741@TWO_WHEELER
//ENTRY@KA-02-EQ-0078@TWO_WHEELER
//EXIT@KA-01-EQ-0741@TWO_WHEELER
//ENTRY@KA-01-EQ-1111@TWO_WHEELER
