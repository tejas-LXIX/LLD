package lldquestions.parkinglot;

import lldquestions.parkinglot.model.gate.EntranceGate;
import lldquestions.parkinglot.model.gate.EntranceGateImpl;
import lldquestions.parkinglot.model.gate.ExitGate;
import lldquestions.parkinglot.model.gate.ExitGateImpl;
import lldquestions.parkinglot.model.vehicle.Vehicle;
import lldquestions.parkinglot.model.vehicle.VehicleType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Client {
    public static void main(String[] args) throws IOException, ParseException {
        EntranceGate entranceGate = new EntranceGateImpl();
        ExitGate exitGate = new ExitGateImpl();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String input = reader.readLine();
            String[] values = input.split("@");
            String command = values[0];
            String vehicleNumber = values[1];
            if ("ENTRY".equals(command)) {
                VehicleType vehicleType = VehicleType.valueOf(values[2]);
                Ticket ticket = entranceGate.parkVehicleAndGetTicket(new Vehicle(vehicleNumber, vehicleType));
                System.out.println(ticket);
            } else if ("EXIT".equals(command)) {
                //the customer will provide the Ticket. It will have all the relevant details, passed in as command line arguments.
                Date entryTime = new SimpleDateFormat("dd-M-yyyy hh:mm:ss", Locale.ENGLISH).parse(values[2]);
                VehicleType vehicleType = VehicleType.valueOf(values[3]);
                String parkingSlotId = values[4];
                Ticket ticket = new Ticket(entryTime, vehicleNumber, vehicleType, Integer.parseInt(parkingSlotId));
                exitGate.leave(ticket);
            }
        }
    }
}

/*
ENTRY@KA-01-EQ-1316@TWO_WHEELER
ENTRY@KA-01-EQ-0741@TWO_WHEELER
EXIT@KA-01-EQ-1316@01-04-2025 21:10:17.287@TWO_WHEELER@1
ENTRY@KA-02-EQ-0078@TWO_WHEELER
EXIT@KA-02-EQ-0078@01-04-2025 21:15:17.287@TWO_WHEELER@1
EXIT@KA-02-EQ-0741@01-04-2025 21:15:15.287@TWO_WHEELER@2
ENTRY@KA-01-EQ-1111@FOUR_WHEELER
EXIT@KA-01-EQ-1111@01-04-2025 21:15:15.287@FOUR_WHEELER@601
*/