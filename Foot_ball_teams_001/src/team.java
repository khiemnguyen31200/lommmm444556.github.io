import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class team {
    ArrayList<Player> allPlayers;
    public void print(){
        allPlayers = new ArrayList<>();
        allPlayers.add(new Player(1, "Marc-André ter Stegen", position.GK));
        allPlayers.add(new Player(2, "Sergiño Dest", position.DF));
        allPlayers.add(new Player(3, "Gerard Piqué", position.DF));
        allPlayers.add(new Player(4, "Ronald Araújo", position.DF));
        allPlayers.add(new Player(5, "Sergio Busquets", position.MF));
        allPlayers.add(new Player(6, "Antoine Griezmann", position.FW));
        allPlayers.add(new Player(7, "Miralem Pjanić", position.MF));
        allPlayers.add(new Player(8, "Martin Braithwaite", position.FW));
        allPlayers.add(new Player(9, "Lionel Messi", position.FW));
        allPlayers.add(new Player(10, "Ousmane Dembélé", position.FW));
        allPlayers.add(new Player(11, "Riqui Puig", position.MF));
        allPlayers.add(new Player(12, "Neto", position.GK));
        allPlayers.add(new Player(13, "Clément Lenglet", position.DF));
        allPlayers.add(new Player(14, "Pedri", position.MF));
        allPlayers.add(new Player(15, "Francisco Trincão", position.FW));
        allPlayers.add(new Player(16, "Jordi Alba", position.DF));
        allPlayers.add(new Player(17, "Matheus Fernandes", position.MF));
        allPlayers.add(new Player(18, "Sergi Roberto", position.DF));
        allPlayers.add(new Player(19, "Frenkie de Jong", position.MF));
        allPlayers.add(new Player(20, "Ansu Fati", position.FW));
        allPlayers.add(new Player(21, "Samuel Umtiti", position.DF));
        allPlayers.add(new Player(22, "Junior Firpo", position.DF));
        System.out.println("Danh sách toàn đội là :");
       for (Player player : allPlayers) {
           System.out.println(player);
       }     
    }
    public void buildTeam(){
        ArrayList<Player> selectedTeam = new ArrayList<Player>();
        Random general = new Random();
        int gateKeeperSize = 0;
        int defenderSize = 0;
        int midFieldSize = 0;
        int forwaderSize = 0;
        System.out.println("Mời bạn chọn cấu hình đội muốn in ra");
        System.out.println(" 1 :1GK - 4DF - 4MF - 2FW");
        System.out.println(" 2 :1GK - 4DF - 3MF - 3FW");
        System.out.println(" 3 :1GK - 3DF - 5MF - 2FW");
        Scanner scanner = new Scanner(System.in);
        int Selection = scanner.nextInt();

        switch (Selection) {
            case 1:
                System.out.println("List player: ");
                while (gateKeeperSize < 1) {
                    int rdGateKeeper = general.nextInt(22);

                    if (allPlayers.get(rdGateKeeper).getPosition().equals(position.GK)) {
                        selectedTeam.add(allPlayers.get(rdGateKeeper));
                        gateKeeperSize++;
                    }
                }

                while (defenderSize < 4) {
                    int rdDefender = general.nextInt(22);
                    if (allPlayers.get(rdDefender).getPosition().equals(position.DF)
                            && !selectedTeam.contains(allPlayers.get(rdDefender))) {
                        selectedTeam.add(allPlayers.get(rdDefender));
                        defenderSize++;
                    }
                }

                while (midFieldSize < 4) {
                    int rdDefender = general.nextInt(22);
                    if (allPlayers.get(rdDefender).getPosition().equals(position.MF)
                            && !selectedTeam.contains(allPlayers.get(rdDefender))) {
                        selectedTeam.add(allPlayers.get(rdDefender));
                        midFieldSize++;
                    }
                }
                while (forwaderSize < 2) {
                    int rdDefender = general.nextInt(22);
                    if (allPlayers.get(rdDefender).getPosition().equals(position.FW)
                            && !selectedTeam.contains(allPlayers.get(rdDefender))) {
                        selectedTeam.add(allPlayers.get(rdDefender));
                        forwaderSize++;
                    }
                }
               for (Player player : selectedTeam) {
                   System.out.println(player);
               };
                break;
            case 2:
                System.out.println("List player: ");
                while (gateKeeperSize < 1) {
                    int rdGateKeeper = general.nextInt(22);

                    if (allPlayers.get(rdGateKeeper).getPosition().equals(position.GK)) {
                        selectedTeam.add(allPlayers.get(rdGateKeeper));
                        gateKeeperSize++;
                    }
                }

                while (defenderSize < 4) {
                    int rdDefender = general.nextInt(22);
                    if (allPlayers.get(rdDefender).getPosition().equals(position.DF)
                            && !selectedTeam.contains(allPlayers.get(rdDefender))) {
                        selectedTeam.add(allPlayers.get(rdDefender));
                        defenderSize++;
                    }
                }

                while (midFieldSize < 3) {
                    int rdDefender = general.nextInt(22);
                    if (allPlayers.get(rdDefender).getPosition().equals(position.MF)
                            && !selectedTeam.contains(allPlayers.get(rdDefender))) {
                        selectedTeam.add(allPlayers.get(rdDefender));
                        midFieldSize++;
                    }
                }
                while (forwaderSize < 3) {
                    int rdDefender = general.nextInt(22);
                    if (allPlayers.get(rdDefender).getPosition().equals(position.FW)
                            && !selectedTeam.contains(allPlayers.get(rdDefender))) {
                        selectedTeam.add(allPlayers.get(rdDefender));
                        forwaderSize++;
                    }
                }
                for (Player player : selectedTeam) {
                    System.out.println(player);
                };
                break;
            case 3:
                System.out.println("List player: ");
                while (gateKeeperSize < 1) {
                    int rdGateKeeper = general.nextInt(22);

                    if (allPlayers.get(rdGateKeeper).getPosition().equals(position.GK)) {
                        selectedTeam.add(allPlayers.get(rdGateKeeper));
                        gateKeeperSize++;
                    }
                }

                while (defenderSize < 3) {
                    int rdDefender = general.nextInt(22);
                    if (allPlayers.get(rdDefender).getPosition().equals(position.DF)
                            && !selectedTeam.contains(allPlayers.get(rdDefender))) {
                        selectedTeam.add(allPlayers.get(rdDefender));
                        defenderSize++;
                    }
                }

                while (midFieldSize < 5) {
                    int rdDefender = general.nextInt(22);
                    if (allPlayers.get(rdDefender).getPosition().equals(position.MF)
                            && !selectedTeam.contains(allPlayers.get(rdDefender))) {
                        selectedTeam.add(allPlayers.get(rdDefender));
                        midFieldSize++;
                    }
                }
                while (forwaderSize < 2) {
                    int rdDefender = general.nextInt(22);
                    if (allPlayers.get(rdDefender).getPosition().equals(position.FW)
                            && !selectedTeam.contains(allPlayers.get(rdDefender))) {
                        selectedTeam.add(allPlayers.get(rdDefender));
                        forwaderSize++;
                    }
                }
                for (Player player : selectedTeam) {
                    System.out.println(player);
                };
                break;
        }
    }
}
