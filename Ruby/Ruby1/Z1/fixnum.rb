class Integer
    def czynniki()
        i=2
        tab= [1]
        while i <= self  do
            if (self/i)*i==self
                tab+=[i]
            end
            i +=1
        end
        return tab
    end
    def ack(y)
        if self==0
            return y+1
        elsif y==0
            return (self-1).ack(1)
        else
            return (self-1).ack(self.ack(y-1))
        end
    end
    def doskonala()
        i=2
        tab= 1
        while i < self  do
            if (self/i)*i==self
                tab+=i
            end
            i +=1
         end
        if tab==self
            return true
        else
            return false
        end
    end
    def slownie()
            pom = self
            pom2=self
            i=0
            licznik=1
            litera=0
            while pom>9
                pom/=10
                i+=1
            end
            while i>0
                licznik*=10
                i-=1
            end
            while licznik>=1
                litera=pom2/licznik
                pom2= pom2 - litera *licznik
                licznik/=10
                if litera==1
                    puts "jeden"
                elsif litera==2
                    puts "dwa"
                elsif litera==3
                    puts "trzy"
                elsif litera==4
                    puts "cztery"
                elsif litera==5
                    puts "piec"
                elsif litera==6
                    puts "tszesc"
                elsif litera==7
                    puts "siedem"
                elsif litera==8
                    puts "osiem"
                elsif litera==9
                    puts "dziewiec"
                elsif litera==0
                    puts "zero"
                end
                if licznik!=0
                    puts " "
                end
            end
    end
end

puts 6.czynniki()
puts 6.doskonala()
puts 2.ack(1)
puts 314.slownie()
