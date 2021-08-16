package me.infiware.customizablefancychat;

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


    public String ColorChatJoin = "";
    public boolean joinMessageChangeHasBeenActivated = false;

    public String ColorChatLeave = "";
    public boolean leaveMessageChangeHasBeenActivated = false;


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;

        if (command.getName().equalsIgnoreCase("joinMessageColour")) {
            if (sender instanceof Player) {

                if (joinMessageChangeHasBeenActivated = true) {
                    if (args.length > 0 && args[0].equals("red")) {
                        ColorChatJoin = "red";
                        player.sendMessage(ChatColor.GREEN + "Your join message colour is now RED");
                    } else if (args.length > 0 && args[0].equals("yellow")) {
                        ColorChatJoin = "yellow";
                        player.sendMessage(ChatColor.GREEN + "Your join message colour is now YELLOW");
                    } else if (args.length > 0 && args[0].equals("green")) {
                        ColorChatJoin = "green";
                        player.sendMessage(ChatColor.GREEN + "Your join message colour is now GREEN");
                    } else if (args.length > 0 && args[0].equals("darkGreen")) {
                        ColorChatJoin = "darkGreen";
                        player.sendMessage(ChatColor.GREEN + "Your join message colour is now DARK GREEN");
                    } else if (args.length > 0 && args[0].equals("blue")) {
                        ColorChatJoin = "blue";
                        player.sendMessage(ChatColor.GREEN + "Your join message colour is now BLUE");
                    } else if (args.length > 0 && args[0].equals("purple")) {
                        ColorChatJoin = "purple";
                        player.sendMessage(ChatColor.GREEN + "Your join message colour is now PURPLE");
                    } else if (args.length > 0 && args[0].equals("black")) {
                        ColorChatJoin = "black";
                        player.sendMessage(ChatColor.GREEN + "Your join message colour is now BLACK");
                    } else if (args.length > 0 && args[0].equals("white")) {
                        ColorChatJoin = "white";
                        player.sendMessage(ChatColor.GREEN + "Your join message colour is now WHITE");
                    } else if (args.length > 0 && args[0].equals("default")) {
                        ColorChatJoin = "default";
                        player.sendMessage(ChatColor.GREEN + "Your join message colour has returned to normal");
                    } else {
                        player.sendMessage(ChatColor.RED + "You must give the command a valid argument");
                        player.sendMessage(ChatColor.RED + "/joinMessageColour <Colour>");
                    }
                } else if (joinMessageChangeHasBeenActivated = false) {
                    joinMessageChangeHasBeenActivated = true;
                    if (args.length > 0 && args[0].equals("red")) {
                        ColorChatJoin = "red";
                        player.sendMessage(ChatColor.GREEN + "Your join message colour is now RED");
                    } else if (args.length > 0 && args[0].equals("yellow")) {
                        ColorChatJoin = "yellow";
                        player.sendMessage(ChatColor.GREEN + "Your join message colour is now YELLOW");
                    } else if (args.length > 0 && args[0].equals("green")) {
                        ColorChatJoin = "green";
                        player.sendMessage(ChatColor.GREEN + "Your join message colour is now GREEN");
                    } else if (args.length > 0 && args[0].equals("darkGreen")) {
                        ColorChatJoin = "darkGreen";
                        player.sendMessage(ChatColor.GREEN + "Your join message colour is now DARK GREEN");
                    } else if (args.length > 0 && args[0].equals("blue")) {
                        ColorChatJoin = "blue";
                        player.sendMessage(ChatColor.GREEN + "Your join message colour is now BLUE");
                    } else if (args.length > 0 && args[0].equals("purple")) {
                        ColorChatJoin = "purple";
                        player.sendMessage(ChatColor.GREEN + "Your join message colour is now PURPLE");
                    } else if (args.length > 0 && args[0].equals("black")) {
                        ColorChatJoin = "black";
                        player.sendMessage(ChatColor.GREEN + "Your join message colour is now BLACK");
                    } else if (args.length > 0 && args[0].equals("white")) {
                        ColorChatJoin = "white";
                        player.sendMessage(ChatColor.GREEN + "Your join message colour is now WHITE");
                    } else if (args.length > 0 && args[0].equals("default")) {
                        ColorChatJoin = "default";
                        player.sendMessage(ChatColor.GREEN + "Your join message colour has returned to normal");
                    } else {
                        player.sendMessage(ChatColor.RED + "You must give the command a valid argument");
                        player.sendMessage(ChatColor.RED + "/joinMessageColour <Colour>");
                    }
                }
            }
        }else if (command.getName().equalsIgnoreCase("leaveMessageColour")){
            if (sender instanceof Player){

                if (leaveMessageChangeHasBeenActivated = true){
                    if(args.length > 0 && args[0].equals("red")) {
                        ColorChatLeave = "red";
                        player.sendMessage(ChatColor.GREEN + "Your leave message colour is now RED");
                    }else if(args.length > 0 && args[0].equals("yellow")){
                        ColorChatLeave = "yellow";
                        player.sendMessage(ChatColor.GREEN + "Your leave message colour is now YELLOW");
                    }else if(args.length > 0 && args[0].equals("green")){
                        ColorChatLeave = "green";
                        player.sendMessage(ChatColor.GREEN + "Your leave message colour is now GREEN");
                    }else if(args.length > 0 && args[0].equals("darkGreen")){
                        ColorChatLeave = "darkGreen";
                        player.sendMessage(ChatColor.GREEN + "Your leave message colour is now DARK GREEN");
                    }else if(args.length > 0 && args[0].equals("blue")){
                        ColorChatLeave = "blue";
                        player.sendMessage(ChatColor.GREEN + "Your leave message colour is now BLUE");
                    }else if(args.length > 0 && args[0].equals("purple")){
                        ColorChatLeave = "purple";
                        player.sendMessage(ChatColor.GREEN + "Your leave message colour is now PURPLE");
                    }else if(args.length > 0 && args[0].equals("black")){
                        ColorChatLeave = "black";
                        player.sendMessage(ChatColor.GREEN + "Your leave message colour is now BLACK");
                    }else if(args.length > 0 && args[0].equals("white")){
                        ColorChatLeave = "white";
                        player.sendMessage(ChatColor.GREEN + "Your leave message colour is now WHITE");
                    }else if(args.length > 0 && args[0].equals("default")){
                        ColorChatLeave = "default";
                        player.sendMessage(ChatColor.GREEN + "Your leave message colour has returned to normal");
                    }else{
                        player.sendMessage(ChatColor.RED + "You must give the command a valid argument");
                        player.sendMessage(ChatColor.RED + "/leaveMessageColour <Colour>");

                    }
                }else if(leaveMessageChangeHasBeenActivated = false){
                    leaveMessageChangeHasBeenActivated = true;
                    if(args.length > 0 && args[0].equals("red")) {
                        ColorChatLeave = "red";
                        player.sendMessage(ChatColor.GREEN + "Your leave message colour is now RED");
                    }else if(args.length > 0 && args[0].equals("yellow")){
                        ColorChatLeave = "yellow";
                        player.sendMessage(ChatColor.GREEN + "Your leave message colour is now YELLOW");
                    }else if(args.length > 0 && args[0].equals("green")){
                        ColorChatLeave = "green";
                        player.sendMessage(ChatColor.GREEN + "Your leave message colour is now GREEN");
                    }else if(args.length > 0 && args[0].equals("darkGreen")){
                        ColorChatLeave = "darkGreen";
                        player.sendMessage(ChatColor.GREEN + "Your leave message colour is now DARK GREEN");
                    }else if(args.length > 0 && args[0].equals("blue")){
                        ColorChatLeave = "blue";
                        player.sendMessage(ChatColor.GREEN + "Your leave message colour is now BLUE");
                    }else if(args.length > 0 && args[0].equals("purple")){
                        ColorChatLeave = "purple";
                        player.sendMessage(ChatColor.GREEN + "Your leave message colour is now PURPLE");
                    }else if(args.length > 0 && args[0].equals("black")){
                        ColorChatLeave = "black";
                        player.sendMessage(ChatColor.GREEN + "Your leave message colour is now BLACK");
                    }else if(args.length > 0 && args[0].equals("white")){
                        ColorChatLeave = "white";
                        player.sendMessage(ChatColor.GREEN + "Your leave message colour is now WHITE");
                    }else if(args.length > 0 && args[0].equals("default")){
                        ColorChatLeave = "default";
                        player.sendMessage(ChatColor.GREEN + "Your leave message colour has returned to normal");
                    }else{
                        player.sendMessage(ChatColor.RED + "You must give the command a valid argument");
                        player.sendMessage(ChatColor.RED + "/leaveMessageColour <Colour>");

                    }
                }

            }
        }



        return false;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e){

        Player player = e.getPlayer();

        e.setJoinMessage(ChatColor.BLUE + "" + ChatColor.BOLD + player.getDisplayName() + ", " + ChatColor.BLUE + "welcome to the best server ever. I hope you like it.");

        if (joinMessageChangeHasBeenActivated=false){
            if (player.hasPlayedBefore()){
                e.setJoinMessage(ChatColor.GREEN + "Welcome back to the server " + ChatColor.YELLOW + player.getDisplayName() + ChatColor.GREEN + "!!! We missed you.");
            }else{
                e.setJoinMessage(ChatColor.BLUE + "" + ChatColor.BOLD + player.getDisplayName() + ", " + ChatColor.BLUE + "welcome to the best server ever. I hope you like it.");
            }
        }else if(joinMessageChangeHasBeenActivated=true){
            if (ColorChatJoin == "red") {
                if (player.hasPlayedBefore()){
                    e.setJoinMessage(ChatColor.RED + "Welcome back to the server " + ChatColor.YELLOW + player.getDisplayName() + ChatColor.RED + "!!! We missed you.");
                }else{
                    e.setJoinMessage(ChatColor.RED + "" + ChatColor.YELLOW + ChatColor.BOLD + player.getDisplayName() + ", " + ChatColor.RED + "welcome to the best server ever. I hope you like it.");
                }
            }else if (ColorChatJoin == "yellow") {
                if (player.hasPlayedBefore()){
                    e.setJoinMessage(ChatColor.YELLOW + "Welcome back to the server " + ChatColor.YELLOW + player.getDisplayName() + ChatColor.YELLOW + "!!! We missed you.");
                }else{
                    e.setJoinMessage(ChatColor.YELLOW + "" + ChatColor.YELLOW + ChatColor.BOLD + player.getDisplayName() + ", " + ChatColor.YELLOW + "welcome to the best server ever. I hope you like it.");
                }
            }else if (ColorChatJoin == "green") {
                if (player.hasPlayedBefore()){
                    e.setJoinMessage(ChatColor.GREEN + "Welcome back to the server " + ChatColor.YELLOW + player.getDisplayName() + ChatColor.GREEN + "!!! We missed you.");
                }else{
                    e.setJoinMessage(ChatColor.GREEN + "" + ChatColor.YELLOW + ChatColor.BOLD + player.getDisplayName() + ", " + ChatColor.GREEN + "welcome to the best server ever. I hope you like it.");
                }
            }else if (ColorChatJoin == "darkGreen") {
                if (player.hasPlayedBefore()){
                    e.setJoinMessage(ChatColor.DARK_GREEN + "Welcome back to the server " + ChatColor.YELLOW + player.getDisplayName() + ChatColor.DARK_GREEN + "!!! We missed you.");
                }else{
                    e.setJoinMessage(ChatColor.DARK_GREEN + "" + ChatColor.YELLOW + ChatColor.BOLD + player.getDisplayName() + ", " + ChatColor.DARK_GREEN + "welcome to the best server ever. I hope you like it.");
                }
            }else if (ColorChatJoin == "blue") {
                if (player.hasPlayedBefore()){
                    e.setJoinMessage(ChatColor.BLUE + "Welcome back to the server " + ChatColor.YELLOW + player.getDisplayName() + ChatColor.BLUE + "!!! We missed you.");
                }else{
                    e.setJoinMessage(ChatColor.BLUE + "" + ChatColor.YELLOW + ChatColor.BOLD + player.getDisplayName() + ", " + ChatColor.BLUE + "welcome to the best server ever. I hope you like it.");
                }
            }else if (ColorChatJoin == "purple") {
                if (player.hasPlayedBefore()){
                    e.setJoinMessage(ChatColor.LIGHT_PURPLE + "Welcome back to the server " + ChatColor.YELLOW + player.getDisplayName() + ChatColor.LIGHT_PURPLE + "!!! We missed you.");
                }else{
                    e.setJoinMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.YELLOW + ChatColor.BOLD + player.getDisplayName() + ", " + ChatColor.LIGHT_PURPLE + "welcome to the best server ever. I hope you like it.");
                }
            }else if (ColorChatJoin == "black") {
                if (player.hasPlayedBefore()){
                    e.setJoinMessage(ChatColor.BLACK + "Welcome back to the server " + ChatColor.YELLOW + player.getDisplayName() + ChatColor.BLACK + "!!! We missed you.");
                }else{
                    e.setJoinMessage(ChatColor.BLACK + "" + ChatColor.YELLOW + ChatColor.BOLD + player.getDisplayName() + ", " + ChatColor.BLACK + "welcome to the best server ever. I hope you like it.");
                }
            }else if (ColorChatJoin == "white") {
                if (player.hasPlayedBefore()){
                    e.setJoinMessage(ChatColor.WHITE + "Welcome back to the server " + ChatColor.YELLOW + player.getDisplayName() + ChatColor.WHITE + "!!! We missed you.");
                }else{
                    e.setJoinMessage(ChatColor.WHITE + "" + ChatColor.YELLOW + ChatColor.BOLD + player.getDisplayName() + ", " + ChatColor.WHITE + "welcome to the best server ever. I hope you like it.");
                }
            }else if (ColorChatJoin == "default") {
                if (player.hasPlayedBefore()){
                    e.setJoinMessage(ChatColor.GREEN + "Welcome back to the server " + ChatColor.YELLOW + player.getDisplayName() + ChatColor.GREEN + "!!! We missed you.");
                }else{
                    e.setJoinMessage(ChatColor.BLUE + "" + ChatColor.BOLD + player.getDisplayName() + ", " + ChatColor.BLUE + "welcome to the best server ever. I hope you like it.");
                }
            }else{
                if (player.hasPlayedBefore()){
                    e.setJoinMessage(ChatColor.GREEN + "Welcome back to the server " + ChatColor.YELLOW + player.getDisplayName() + ChatColor.GREEN + "!!! We missed you.");
                }else{
                    e.setJoinMessage(ChatColor.BLUE + "" + ChatColor.BOLD + player.getDisplayName() + ", " + ChatColor.BLUE + "welcome to the best server ever. I hope you like it.");
                }
            }
        }
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e){

        Player player = e.getPlayer();

        e.setQuitMessage(ChatColor.YELLOW + player.getDisplayName() + ChatColor.RED + " has left the server o/");

        if (leaveMessageChangeHasBeenActivated=true){
            e.setQuitMessage(ChatColor.YELLOW + player.getDisplayName() + ChatColor.GREEN + " has left the server o/");
        }else if(leaveMessageChangeHasBeenActivated=true){
            if (ColorChatLeave == "red") {
                e.setQuitMessage(ChatColor.YELLOW + player.getDisplayName() + ChatColor.RED + " has left the server o/");
            }else if (ColorChatLeave == "yellow") {
                e.setQuitMessage(ChatColor.YELLOW + player.getDisplayName() + ChatColor.YELLOW + " has left the server o/");
            }else if (ColorChatLeave == "green") {
                e.setQuitMessage(ChatColor.YELLOW + player.getDisplayName() + ChatColor.GREEN + " has left the server o/");
            }else if (ColorChatLeave == "darkGreen") {
                e.setQuitMessage(ChatColor.YELLOW + player.getDisplayName() + ChatColor.DARK_GREEN + " has left the server o/");
            }else if (ColorChatLeave == "blue") {
                e.setQuitMessage(ChatColor.YELLOW + player.getDisplayName() + ChatColor.BLUE + " has left the server o/");
            }else if (ColorChatLeave == "purple") {
                e.setQuitMessage(ChatColor.YELLOW + player.getDisplayName() + ChatColor.LIGHT_PURPLE + " has left the server o/");
            }else if (ColorChatLeave == "black") {
                e.setQuitMessage(ChatColor.YELLOW + player.getDisplayName() + ChatColor.BLACK + " has left the server o/");
            }else if (ColorChatLeave == "white") {
                e.setQuitMessage(ChatColor.YELLOW + player.getDisplayName() + ChatColor.WHITE + " has left the server o/");
            }else if (ColorChatLeave == "default") {
                e.setQuitMessage(ChatColor.YELLOW + player.getDisplayName() + ChatColor.RED + " has left the server o/");
            }else{
                e.setQuitMessage(ChatColor.YELLOW + player.getDisplayName() + ChatColor.RED + " has left the server o/");
            }
        }
    }


    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("joinMessageColour").setExecutor(this);
        getCommand("leaveMessageColour").setExecutor(this);

        getServer().getPluginManager().registerEvents(this, this);


    }

    
}