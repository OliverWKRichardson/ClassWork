#Loading Stuff
import os
import discord
from dotenv import load_dotenv
from discord.ext import commands
from pretty_help import PrettyHelp
from datetime import datetime

intents = discord.Intents.default()
intents.members = True

load_dotenv()
TOKEN = os.getenv('DISCORD_TOKEN')
GUILD = os.getenv('DISCORD_GUILD')

#Set Prefix For Commands
def get_prefix(client, message):

    #In Server Chat Use ! As A Prefix
    if message.guild:
        prefix = '!'    

    #In DM's Use No Prefix
    else:
        prefix = ''  

    return prefix

#Create Bot
bot = commands.Bot(command_prefix=get_prefix,
                   help_command=PrettyHelp(),
                   case_insensitive=True,
                   description='DroneOhTwo\'s Personal Bot',
                   intents=intents
                   )

#Specify Where The cogs Are
cogs = ['cogs.basic','cogs.main']

#Start Up
@bot.event
async def on_ready():
    #Look for the server specified
    guild = discord.utils.get(bot.guilds, name=GUILD)

    #Print Connection Data
    print(
        f'{bot.user} is connected to the following server:\n'
        f'{guild.name}(id: {guild.id})'
    )

    #Load cogs
    for cog in cogs:
        bot.load_extension(cog)

    #Print Members Of The Server
    members = '\n - '.join([member.name for member in guild.members])
    print(f'Server Members:\n - {members}')

    #Send Notifaction
    try:
        log_channel = discord.utils.get(guild.channels, name='bot-log')
        await log_channel.send('Bot Has Come Online')
    except AttributeError:
        await guild.create_text_channel('bot-log')
        log_channel = discord.utils.get(guild.channels, name='bot-log')
        await log_channel.send('Bot Has Come Online')

#New Member Join Message
@bot.event
async def on_member_join(member):
    guild = discord.utils.get(bot.guilds, name=GUILD)
    #Create Dm Channel
    await member.create_dm()
    #Send Message
    await member.dm_channel.send(
        f'Hi {member.name}, welcome to 'f'{guild.name}! I am 'f'{bot.user.name} type \'help\' to see a list of my commands. Whilst in a server with me add ! to the start of your command'
        )

#Error Handling
@bot.event
async def on_command_error(ctx, error):
    if isinstance(error, commands.BadArgument):
        error = 'BadArgument'

    elif isinstance(error, commands.MissingRequiredArgument):
        error = 'MissingRequiredArgument'

    elif isinstance(error, commands.CommandNotFound):
        error = 'CommandNotFound'

    else:
        error = 'UnknownError'
  
    await ctx.channel.send('An Error Occured Due To: ' + error + ', Try \'help\' For A List Of Commands')

    Error_Log = open('err.txt', 'a')
    now = datetime.now()
    try:
        Error_Log.writelines('An Error Occured Due To: '+ error +' at ' + now.strftime("%d/%m/%Y %H:%M:%S") +' in ' + ctx.author.name + ' \'s Message in ' + ctx.channel.name + ' in ' + ctx.guild.name +'\n')
    except AttributeError:
        Error_Log.writelines('An Error Occured Due To: '+ error +' at ' + now.strftime("%d/%m/%Y %H:%M:%S") +' in '+ ctx.author.name +'\'s DM Channel\n')
        
#Active The Bot
bot.run(TOKEN,bot=True,reconnect=True)
