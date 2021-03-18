package WorldEdit_Power_up.tests;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class test implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender Sender, Command cmd, String s, String[] args) {

        if(cmd.getName().equalsIgnoreCase("계산")) {

            int num_1 = 0;
            int num_2 = 0;
            int num = 0;

            if(args[0].equalsIgnoreCase("첫번째 값")) {
                if(args[1].length() != 0) {
                    num_1 = Integer.parseInt(args[2]);
                }
            }

            if(args[0].equalsIgnoreCase("두번째 값")) {
                if(args[1].length() != 0) {
                    num_2 = Integer.parseInt(args[2]);
                }
            }

            if(args[0].equalsIgnoreCase("덧셈")) {
                num = num_1 + num_2;
                System.out.println("결과:" + num);
            }

        }

        return false;
    }

}
