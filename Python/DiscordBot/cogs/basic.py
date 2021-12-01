#Imports
from discord.ext import commands
from datetime import datetime as d
import discord
import random

###Basic Commands
class Basic(commands.Cog):
    
    def __init__(self, bot):
        self.bot = bot
        
    ##Roll A Dice
    @commands.command(
        name='rolldice',
        help='Rolls A Dice'
        )
    #Function To Roll The Dice
    async def roll(self, ctx, number_of_dice: int, number_of_sides: int):
        dice = [
            str(random.choice(range(1, number_of_sides + 1)))
            for _ in range(number_of_dice)
        ]
        await ctx.send(', '.join(dice))

    ##Check Ping
    @commands.command(
        name='ping',
        aliases=['p'],
        help='Returns Approximate Ping'
        )
    #Function To Find Ping
    async def ping_command(self, ctx):
            start = d.timestamp(d.now())
            msg = await ctx.send(content='Pinging')
            await msg.edit(content=f'Your Ping Is Approximately: {( d.timestamp( d.now() ) - start ) * 1000 }ms.')
            return

    ##Close Bot
    @commands.command(
        name='terminate',
        help='Closes The Bot. Requires Admin Role.'
        )
    #Check An Admin Has Called The Command
    @commands.has_role('Admin')
    #Function To Close
    async def close(self,ctx):
        guild = ctx.guild
        log_channel = discord.utils.get(guild.channels, name='bot-log')
        await log_channel.send('Bot Has Gone Offline')
        quit()
    
#Sends The Cog To The Main Bot
def setup(bot):
    bot.add_cog(Basic(bot))
