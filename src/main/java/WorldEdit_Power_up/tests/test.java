package WorldEdit_Power_up.tests;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.Arrays;
import java.util.List;

public class test implements CommandExecutor, TabCompleter {

    @Override
    public boolean onCommand(CommandSender Sender, Command cmd, String s, String[] args) {

        if(cmd.getName().equalsIgnoreCase("Calculation")) {

            int num_1 = 0;
            int num_2 = 0;
            int num = 0;

            if(args[0].equalsIgnoreCase("num_1")) {
                if(args[1].length() != 0) {
                    num_1 = Integer.parseInt(args[2]);
                }
            }

            if(args[0].equalsIgnoreCase("num_2")) {
                if(args[1].length() != 0) {
                    num_2 = Integer.parseInt(args[2]);
                }
            }

            if(args[0].equalsIgnoreCase("+")) {
                num = num_1 + num_2;
                System.out.println("결과:" + num);
            }

            if(args[0].equalsIgnoreCase("-")) {
                num = num_1 - num_2;
                System.out.println("결과:" + num);
            }

            if(args[0].equalsIgnoreCase("*")) {
                num = num_1 * num_2;
                System.out.println("결과:" + num);
            }

            if(args[0].equalsIgnoreCase("/")) {
                num = num_1 / num_2;
                System.out.println("결과:" + num);
            }
        }

        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] args) {

        if (command.getName().equals("Calculation")) {
            if (args.length == 1) {
                return Arrays.asList("num_1", "num_2", "+", "-", "*", "/");
            }

        }

        return null;
    }
}
