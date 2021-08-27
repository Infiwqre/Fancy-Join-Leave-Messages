package me.infiware.customizablefancychat;

// import statements
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class joinLeaveMessagesMain extends JavaPlugin implements Listener {

    // variables that decides what colour is in the join/leave messages
    public String ColorChatJoin = "";
    public boolean joinMessageChangeHasBeenActivated = false;

    public String ColorChatLeave = "";
    public boolean leaveMessageChangeHasBeenActivated = false;


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        // thing that registers the player's existence
        Player p = (Player) sender;
        int allowPlayerColourChange = getConfig().getInt("allowPlayerljmcChange");

        // thing that makes the command
        if (command.getName().equalsIgnoreCase("joinMessageColour")) {
            // join message colour changing command logic
            if (sender instanceof Player) {

                if (joinMessageChangeHasBeenActivated = true) {
                    if (allowPlayerColourChange == 1) {
                        if (args.length > 0 && args[0].equalsIgnoreCase("red")) {
                            ColorChatJoin = "red";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.RED + " RED");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("yellow")) {
                            ColorChatJoin = "yellow";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now"+ ChatColor.YELLOW + " YELLOW");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("green")) {
                            ColorChatJoin = "green";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.GREEN + " GREEN");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("darkGreen")) {
                            ColorChatJoin = "darkGreen";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.DARK_GREEN + " DARK GREEN");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("blue")) {
                            ColorChatJoin = "blue";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.BLUE + " BLUE");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("aqua")) {
                            ColorChatJoin = "aqua";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.AQUA + " AQUA");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("purple")) {
                            ColorChatJoin = "purple";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.LIGHT_PURPLE + " PURPLE");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("darkPurple")) {
                            ColorChatJoin = "darkPurple";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.DARK_PURPLE + " DARK PURPLE");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("black")) {
                            ColorChatJoin = "black";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.BLACK + " BLACK");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("white")) {
                            ColorChatJoin = "white";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.WHITE + " WHITE");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("default")) {
                            ColorChatJoin = "default";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour has returned to normal");
                        } else {
                            p.sendMessage(ChatColor.RED + "You must give the command a valid argument");
                            p.sendMessage(ChatColor.RED + "/joinMessageColour <colour>");
                        }
                    }else if (allowPlayerColourChange == 2){
                        p.sendMessage(ChatColor.RED + "Using this command has been disabled by the owner of the server");
                        p.sendMessage(ChatColor.RED + "If this is a mistake, contact the owner");
                    }else{
                        if (args.length > 0 && args[0].equalsIgnoreCase("red")) {
                            ColorChatJoin = "red";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.RED + " RED");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("yellow")) {
                            ColorChatJoin = "yellow";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now"+ ChatColor.YELLOW + " YELLOW");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("green")) {
                            ColorChatJoin = "green";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.GREEN + " GREEN");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("darkGreen")) {
                            ColorChatJoin = "darkGreen";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.DARK_GREEN + " DARK GREEN");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("blue")) {
                            ColorChatJoin = "blue";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.BLUE + " BLUE");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("aqua")) {
                            ColorChatJoin = "aqua";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.AQUA + " AQUA");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("purple")) {
                            ColorChatJoin = "purple";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.LIGHT_PURPLE + " PURPLE");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("darkPurple")) {
                            ColorChatJoin = "darkPurple";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.DARK_PURPLE + " DARK PURPLE");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("black")) {
                            ColorChatJoin = "black";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.BLACK + " BLACK");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("white")) {
                            ColorChatJoin = "white";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.WHITE + " WHITE");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("default")) {
                            ColorChatJoin = "default";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour has returned to normal");
                        } else {
                            p.sendMessage(ChatColor.RED + "You must give the command a valid argument");
                            p.sendMessage(ChatColor.RED + "/joinMessageColour <colour>");
                        }
                    }
                } else if (joinMessageChangeHasBeenActivated = false) {
                    // if this command was never used then default join message color will be chosen
                    joinMessageChangeHasBeenActivated = true;
                    if (allowPlayerColourChange == 1) {
                        if (args.length > 0 && args[0].equalsIgnoreCase("red")) {
                            ColorChatJoin = "red";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.RED + " RED");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("yellow")) {
                            ColorChatJoin = "yellow";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now"+ ChatColor.YELLOW + " YELLOW");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("green")) {
                            ColorChatJoin = "green";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.GREEN + " GREEN");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("darkGreen")) {
                            ColorChatJoin = "darkGreen";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.DARK_GREEN + " DARK GREEN");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("blue")) {
                            ColorChatJoin = "blue";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.BLUE + " BLUE");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("aqua")) {
                            ColorChatJoin = "aqua";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.AQUA + " AQUA");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("purple")) {
                            ColorChatJoin = "purple";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.LIGHT_PURPLE + " PURPLE");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("darkPurple")) {
                            ColorChatJoin = "darkPurple";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.DARK_PURPLE + " DARK PURPLE");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("black")) {
                            ColorChatJoin = "black";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.BLACK + " BLACK");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("white")) {
                            ColorChatJoin = "white";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.WHITE + " WHITE");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("default")) {
                            ColorChatJoin = "default";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour has returned to normal");
                        } else {
                            p.sendMessage(ChatColor.RED + "You must give the command a valid argument");
                            p.sendMessage(ChatColor.RED + "/joinMessageColour <colour>");
                        }
                    }else if (allowPlayerColourChange == 2){
                        p.sendMessage(ChatColor.RED + "Using this command has been disabled by the owner of the server");
                        p.sendMessage(ChatColor.RED + "If this is a mistake, contact the owner");
                        joinMessageChangeHasBeenActivated = false;
                    }else{
                        if (args.length > 0 && args[0].equalsIgnoreCase("red")) {
                            ColorChatJoin = "red";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.RED + " RED");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("yellow")) {
                            ColorChatJoin = "yellow";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now"+ ChatColor.YELLOW + " YELLOW");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("green")) {
                            ColorChatJoin = "green";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.GREEN + " GREEN");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("darkGreen")) {
                            ColorChatJoin = "darkGreen";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.DARK_GREEN + " DARK GREEN");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("blue")) {
                            ColorChatJoin = "blue";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.BLUE + " BLUE");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("aqua")) {
                            ColorChatJoin = "aqua";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.AQUA + " AQUA");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("purple")) {
                            ColorChatJoin = "purple";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.LIGHT_PURPLE + " PURPLE");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("darkPurple")) {
                            ColorChatJoin = "darkPurple";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.DARK_PURPLE + " DARK PURPLE");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("black")) {
                            ColorChatJoin = "black";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.BLACK + " BLACK");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("white")) {
                            ColorChatJoin = "white";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour is now" + ChatColor.WHITE + " WHITE");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("default")) {
                            ColorChatJoin = "default";
                            p.sendMessage(ChatColor.GREEN + "Your join message colour has returned to normal");
                        } else {
                            p.sendMessage(ChatColor.RED + "You must give the command a valid argument");
                            p.sendMessage(ChatColor.RED + "/joinMessageColour <colour>");
                        }
                    }
                }
            }else{
                // when command is sent by command block/console
                System.out.println("You must be a player to run this command");
            }
        }else if (command.getName().equalsIgnoreCase("leaveMessageColour")){
            if (sender instanceof Player){

                if (leaveMessageChangeHasBeenActivated = true){
                    if (allowPlayerColourChange == 1){
                        if(args.length > 0 && args[0].equalsIgnoreCase("red")) {
                            ColorChatLeave = "red";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.RED + " RED");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("yellow")){
                            ColorChatLeave = "yellow";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now"+ ChatColor.YELLOW + " YELLOW");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("green")){
                            ColorChatLeave = "green";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.GREEN + " GREEN");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("darkGreen")){
                            ColorChatLeave = "darkGreen";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.DARK_GREEN + " DARK GREEN");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("blue")){
                            ColorChatLeave = "blue";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.BLUE + " BLUE");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("aqua")){
                            ColorChatLeave = "aqua";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.AQUA + " AQUA");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("purple")){
                            ColorChatLeave = "purple";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.LIGHT_PURPLE + " PURPLE");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("darkPurple")) {
                            ColorChatJoin = "darkPurple";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.DARK_PURPLE + " DARK PURPLE");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("black")){
                            ColorChatLeave = "black";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.BLACK + " BLACK");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("white")){
                            ColorChatLeave = "white";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.WHITE + " WHITE");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("default")){
                            ColorChatLeave = "default";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour has returned to normal");
                        }else{
                            p.sendMessage(ChatColor.RED + "You must give the command a valid argument");
                            p.sendMessage(ChatColor.RED + "/leaveMessageColour <colour>");

                        }
                    }else if (allowPlayerColourChange == 2){
                        p.sendMessage(ChatColor.RED + "Using this command has been disabled by the owner of the server");
                        p.sendMessage(ChatColor.RED + "If this is a mistake, contact the owner");
                    }else{
                        if(args.length > 0 && args[0].equalsIgnoreCase("red")) {
                            ColorChatLeave = "red";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.RED + " RED");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("yellow")){
                            ColorChatLeave = "yellow";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now"+ ChatColor.YELLOW + " YELLOW");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("green")){
                            ColorChatLeave = "green";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.GREEN + " GREEN");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("darkGreen")){
                            ColorChatLeave = "darkGreen";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.DARK_GREEN + " DARK GREEN");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("blue")){
                            ColorChatLeave = "blue";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.BLUE + " BLUE");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("aqua")){
                            ColorChatLeave = "aqua";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.AQUA + " AQUA");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("purple")){
                            ColorChatLeave = "purple";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.LIGHT_PURPLE + " PURPLE");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("darkPurple")) {
                            ColorChatJoin = "darkPurple";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.DARK_PURPLE + " DARK PURPLE");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("black")){
                            ColorChatLeave = "black";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.BLACK + " BLACK");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("white")){
                            ColorChatLeave = "white";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.WHITE + " WHITE");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("default")){
                            ColorChatLeave = "default";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour has returned to normal");
                        }else{
                            p.sendMessage(ChatColor.RED + "You must give the command a valid argument");
                            p.sendMessage(ChatColor.RED + "/leaveMessageColour <colour>");

                        }
                    }
                }else if(leaveMessageChangeHasBeenActivated = false){
                    //same thing above but leave message
                    leaveMessageChangeHasBeenActivated = true;
                    if (allowPlayerColourChange == 1){
                        if(args.length > 0 && args[0].equalsIgnoreCase("red")) {
                            ColorChatLeave = "red";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.RED + " RED");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("yellow")){
                            ColorChatLeave = "yellow";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now"+ ChatColor.YELLOW + " YELLOW");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("green")){
                            ColorChatLeave = "green";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.GREEN + " GREEN");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("darkGreen")){
                            ColorChatLeave = "darkGreen";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.DARK_GREEN + " DARK GREEN");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("blue")){
                            ColorChatLeave = "blue";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.BLUE + " BLUE");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("aqua")){
                            ColorChatLeave = "aqua";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.AQUA + " AQUA");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("purple")){
                            ColorChatLeave = "purple";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.LIGHT_PURPLE + " PURPLE");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("darkPurple")) {
                            ColorChatJoin = "darkPurple";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.DARK_PURPLE + " DARK PURPLE");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("black")){
                            ColorChatLeave = "black";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.BLACK + " BLACK");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("white")){
                            ColorChatLeave = "white";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.WHITE + " WHITE");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("default")){
                            ColorChatLeave = "default";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour has returned to normal");
                        }else{
                            p.sendMessage(ChatColor.RED + "You must give the command a valid argument");
                            p.sendMessage(ChatColor.RED + "/leaveMessageColour <colour>");

                        }
                    }else if (allowPlayerColourChange == 2){
                        p.sendMessage(ChatColor.RED + "Using this command has been disabled by the owner of the server");
                        p.sendMessage(ChatColor.RED + "If this is a mistake, contact the owner");
                        leaveMessageChangeHasBeenActivated = false;
                    }else{
                        if(args.length > 0 && args[0].equalsIgnoreCase("red")) {
                            ColorChatLeave = "red";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.RED + " RED");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("yellow")){
                            ColorChatLeave = "yellow";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now"+ ChatColor.YELLOW + " YELLOW");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("green")){
                            ColorChatLeave = "green";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.GREEN + " GREEN");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("darkGreen")){
                            ColorChatLeave = "darkGreen";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.DARK_GREEN + " DARK GREEN");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("blue")){
                            ColorChatLeave = "blue";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.BLUE + " BLUE");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("aqua")){
                            ColorChatLeave = "aqua";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.AQUA + " AQUA");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("purple")){
                            ColorChatLeave = "purple";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.LIGHT_PURPLE + " PURPLE");
                        } else if (args.length > 0 && args[0].equalsIgnoreCase("darkPurple")) {
                            ColorChatJoin = "darkPurple";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.DARK_PURPLE + " DARK PURPLE");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("black")){
                            ColorChatLeave = "black";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.BLACK + " BLACK");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("white")){
                            ColorChatLeave = "white";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour is now" + ChatColor.WHITE + " WHITE");
                        }else if(args.length > 0 && args[0].equalsIgnoreCase("default")){
                            ColorChatLeave = "default";
                            p.sendMessage(ChatColor.GREEN + "Your leave message colour has returned to normal");
                        }else{
                            p.sendMessage(ChatColor.RED + "You must give the command a valid argument");
                            p.sendMessage(ChatColor.RED + "/leaveMessageColour <colour>");

                        }
                    }
                }

            }else{
                // when command is sent by command block/console
                System.out.println("You must be a player to run this command");
            }
        }


        // prevents the command being outputted to the sender with the command statement
        return true;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e){

        // thing that registers command events
        Player p = e.getPlayer();
        String joinMessageText1 = getConfig().getString("joinMessageText1");
        String joinMessageText2 = getConfig().getString("joinMessageText2");
        
        
        if (joinMessageChangeHasBeenActivated=false){
            // if command was never used before to simplify program
            if (p.hasPlayedBefore()){
                // if statement to send a different join/leave message if you have never played in "" server
                e.setJoinMessage(ChatColor.GREEN + joinMessageText1 + ChatColor.YELLOW + p.getDisplayName() + ChatColor.GREEN + joinMessageText2);
            }else{
                e.setJoinMessage(ChatColor.BLUE + "" + ChatColor.BOLD + p.getDisplayName() + ", " + ChatColor.BLUE + "welcome to the best server ever. I hope you like it.");
            }
        }else if(joinMessageChangeHasBeenActivated=true){
            // thing that changes colour of chat on your join messages
            if (ColorChatJoin == "red") {
                if (p.hasPlayedBefore()){
                    // if statement to send a different join/leave message if you have never played in "" server
                    e.setJoinMessage(ChatColor.RED + joinMessageText1 + ChatColor.YELLOW + p.getDisplayName() + ChatColor.RED + joinMessageText2);
                }else{
                    e.setJoinMessage(ChatColor.RED + "" + ChatColor.YELLOW + ChatColor.BOLD + p.getDisplayName() + ", " + ChatColor.RED + "welcome to the best server ever. I hope you like it.");
                }
            }else if (ColorChatJoin == "yellow") {
                if (p.hasPlayedBefore()){
                    e.setJoinMessage(ChatColor.YELLOW + joinMessageText1 + ChatColor.YELLOW + p.getDisplayName() + ChatColor.YELLOW + joinMessageText2);
                }else{
                    e.setJoinMessage(ChatColor.YELLOW + "" + ChatColor.YELLOW + ChatColor.BOLD + p.getDisplayName() + ", " + ChatColor.YELLOW + "welcome to the best server ever. I hope you like it.");
                }
            }else if (ColorChatJoin == "green") {
                if (p.hasPlayedBefore()){
                    e.setJoinMessage(ChatColor.GREEN + joinMessageText1 + ChatColor.YELLOW + p.getDisplayName() + ChatColor.GREEN + joinMessageText2);
                }else{
                    e.setJoinMessage(ChatColor.GREEN + "" + ChatColor.YELLOW + ChatColor.BOLD + p.getDisplayName() + ", " + ChatColor.GREEN + "welcome to the best server ever. I hope you like it.");
                }
            }else if (ColorChatJoin == "darkGreen") {
                if (p.hasPlayedBefore()){
                    e.setJoinMessage(ChatColor.DARK_GREEN + joinMessageText1 + ChatColor.YELLOW + p.getDisplayName() + ChatColor.DARK_GREEN + joinMessageText2);
                }else{
                    e.setJoinMessage(ChatColor.DARK_GREEN + "" + ChatColor.YELLOW + ChatColor.BOLD + p.getDisplayName() + ", " + ChatColor.DARK_GREEN + "welcome to the best server ever. I hope you like it.");
                }
            }else if (ColorChatJoin == "blue") {
                if (p.hasPlayedBefore()){
                    e.setJoinMessage(ChatColor.BLUE + joinMessageText1 + ChatColor.YELLOW + p.getDisplayName() + ChatColor.BLUE + joinMessageText2);
                }else{
                    e.setJoinMessage(ChatColor.BLUE + "" + ChatColor.YELLOW + ChatColor.BOLD + p.getDisplayName() + ", " + ChatColor.BLUE + "welcome to the best server ever. I hope you like it.");
                }
            }else if (ColorChatJoin == "purple") {
                if (p.hasPlayedBefore()){
                    e.setJoinMessage(ChatColor.LIGHT_PURPLE + joinMessageText1 + ChatColor.YELLOW + p.getDisplayName() + ChatColor.LIGHT_PURPLE + joinMessageText2);
                }else{
                    e.setJoinMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.YELLOW + ChatColor.BOLD + p.getDisplayName() + ", " + ChatColor.LIGHT_PURPLE + "welcome to the best server ever. I hope you like it.");
                }
            }else if (ColorChatJoin == "darkPurple") {
                if (p.hasPlayedBefore()){
                    e.setJoinMessage(ChatColor.DARK_PURPLE + joinMessageText1 + ChatColor.YELLOW + p.getDisplayName() + ChatColor.DARK_PURPLE + joinMessageText2);
                }else{
                    e.setJoinMessage(ChatColor.DARK_PURPLE + "" + ChatColor.YELLOW + ChatColor.BOLD + p.getDisplayName() + ", " + ChatColor.DARK_PURPLE + "welcome to the best server ever. I hope you like it.");
                }
            }else if (ColorChatJoin == "black") {
                if (p.hasPlayedBefore()){
                    e.setJoinMessage(ChatColor.BLACK + joinMessageText1 + ChatColor.YELLOW + p.getDisplayName() + ChatColor.BLACK + joinMessageText2);
                }else{
                    e.setJoinMessage(ChatColor.BLACK + "" + ChatColor.YELLOW + ChatColor.BOLD + p.getDisplayName() + ", " + ChatColor.BLACK + "welcome to the best server ever. I hope you like it.");
                }
            }else if (ColorChatJoin == "white") {
                if (p.hasPlayedBefore()){
                    e.setJoinMessage(ChatColor.WHITE + joinMessageText1 + ChatColor.YELLOW + p.getDisplayName() + ChatColor.WHITE + joinMessageText2);
                }else{
                    e.setJoinMessage(ChatColor.WHITE + "" + ChatColor.YELLOW + ChatColor.BOLD + p.getDisplayName() + ", " + ChatColor.WHITE + "welcome to the best server ever. I hope you like it.");
                }
            }else if (ColorChatJoin == "default") {
                if (p.hasPlayedBefore()){
                    e.setJoinMessage(ChatColor.GREEN + joinMessageText1 + ChatColor.YELLOW + p.getDisplayName() + ChatColor.GREEN + joinMessageText2);
                }else{
                    e.setJoinMessage(ChatColor.BLUE + "" + ChatColor.BOLD + p.getDisplayName() + ", " + ChatColor.BLUE + "welcome to the best server ever. I hope you like it.");
                }
            }else{
                if (p.hasPlayedBefore()){
                    e.setJoinMessage(ChatColor.GREEN + joinMessageText1 + ChatColor.YELLOW + p.getDisplayName() + ChatColor.GREEN + joinMessageText2);
                }else{
                    e.setJoinMessage(ChatColor.BLUE + "" + ChatColor.BOLD + p.getDisplayName() + ", " + ChatColor.BLUE + "welcome to the best server ever. I hope you like it.");
                }
            }
        }
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e){

        // thing that registers player events
        Player p = e.getPlayer();
        String leaveMessageText = getConfig().getString("leaveMessageText1");

        if (leaveMessageChangeHasBeenActivated=false){
            // if command was never used before to simplify command
            e.setQuitMessage(ChatColor.YELLOW + p.getDisplayName() + ChatColor.RED + leaveMessageText);
        }else if(leaveMessageChangeHasBeenActivated=true){
            if (ColorChatLeave == "red") {
                // thing that changes the color of chat for your leave message
                e.setQuitMessage(ChatColor.YELLOW + p.getDisplayName() + ChatColor.RED + leaveMessageText);
            }else if (ColorChatLeave == "yellow") {
                e.setQuitMessage(ChatColor.YELLOW + p.getDisplayName() + ChatColor.YELLOW + leaveMessageText);
            }else if (ColorChatLeave == "green") {
                e.setQuitMessage(ChatColor.YELLOW + p.getDisplayName() + ChatColor.GREEN + leaveMessageText);
            }else if (ColorChatLeave == "darkGreen") {
                e.setQuitMessage(ChatColor.YELLOW + p.getDisplayName() + ChatColor.DARK_GREEN + leaveMessageText);
            }else if (ColorChatLeave == "blue") {
                e.setQuitMessage(ChatColor.YELLOW + p.getDisplayName() + ChatColor.BLUE + leaveMessageText);
            }else if (ColorChatLeave == "purple") {
                e.setQuitMessage(ChatColor.YELLOW + p.getDisplayName() + ChatColor.LIGHT_PURPLE + leaveMessageText);
            }else if (ColorChatLeave == "darkPurple") {
                e.setQuitMessage(ChatColor.YELLOW + p.getDisplayName() + ChatColor.DARK_PURPLE + leaveMessageText);
            }else if (ColorChatLeave == "black") {
                e.setQuitMessage(ChatColor.YELLOW + p.getDisplayName() + ChatColor.BLACK + leaveMessageText);
            }else if (ColorChatLeave == "white") {
                e.setQuitMessage(ChatColor.YELLOW + p.getDisplayName() + ChatColor.WHITE + leaveMessageText);
            }else if (ColorChatLeave == "default") {
                e.setQuitMessage(ChatColor.YELLOW + p.getDisplayName() + ChatColor.RED + leaveMessageText);
            }else{
                e.setQuitMessage(ChatColor.YELLOW + p.getDisplayName() + ChatColor.RED + leaveMessageText);
            }
        }
    }


    @Override
    public void onEnable() {
        // Plugin startup logic

        // the thing that makes the commands work
        getCommand("joinMessageColour").setExecutor(this);
        getCommand("leaveMessageColour").setExecutor(this);

        // the thing that makes the listener/events work
        getServer().getPluginManager().registerEvents(this, this);

        // the thing that gets the config file
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        System.out.println("Thank you for using Customizable Fancy Chat by: Infiware");
        System.out.println("If you enjoy this plugin please give a rating on spigotmc.org");
    }

    
}
