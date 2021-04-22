class Funkcja
    def initialize(&wzor)
        @wzor = wzor
    end

    def value(x)
        @wzor.call(x)
    end

    def zerowe(a,b,e)
        t=[]
        if @wzor.call(a)==0
            t+=[a]
        end
        i=1
        while a+(i*e)<b
            if @wzor.call(a+(i*e))==0
                t+=[a+(i*e)]
                /puts a+(i*e)/
            elsif @wzor.call(a+((i-1)*e))*@wzor.call(a+(i*e))<0
                t+=[a+(i*e)]
            end
            i+=1
        end
        if @wzor.call(b)==0
            t+=[b]
        end
        if t.length==0
            return nil
        else
            return t
        end
    end

    def pole(a,b)
        pole=0
        i=1
        e=0.01
        while a+(i*e)<b
            pole+=e*0.5*(@wzor.call(a+((i-1)*e))+@wzor.call(a+(i*e)))
            i+=1
        end
        pole+=(b-(a+((i-1)*e)))*0.5*(@wzor.call(a+((i-1)*e))+@wzor.call(b))
        return pole
    end

    def poch(x)
        h=0.000001
        return (@wzor.call(x+h)-@wzor.call(x))/h
    end
end 

funkcja=Funkcja.new{ |x| x*x }
puts funkcja.value(5)
puts funkcja.zerowe(-1, 1.5, 0.1)
puts funkcja.pole(0, 1)
puts funkcja.poch(5)
