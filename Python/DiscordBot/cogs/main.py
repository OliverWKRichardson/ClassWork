#Imports
from discord.ext import commands
import discord

###Main Commands
class Main(commands.Cog):
    
    def __init__(self, bot):
        self.bot = bot

    ##Test Cog
    @commands.command(
        name='Test',
        help='Tests The Main Cog'
        )
    #Function Test
    async def test(self,ctx,message):
        guild = ctx.guild
        log_channel = discord.utils.get(guild.channels, name='bot-log')
        await log_channel.send(message)
        
    
#Sends The Cog To The Main Bot
def setup(bot):
    bot.add_cog(Main(bot))
