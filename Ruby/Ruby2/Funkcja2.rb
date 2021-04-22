class Funkcja2
    def initialize(&wzor)
        @wzor = wzor
    end

    def value(x, y)
        @wzor.call(x, y)
    end

    def objetosc(a, b, c, d)
        i=1
        obj=0
        e=0.01
        while a+e*i<=b
            j=1
            while c+e*j<=d
                obj+=e*e*@wzor.call(a+e*i, c+e*j)
                j+=1
            end
            i+=1
        end
        return obj
    end

    def poziomica(a,b,c,d,wysokosc)
        i=0
        t=[]
        e=0.01
        l=0.000001
        while a+e*i<=b
            j=0
            while c+e*j<=d
                if @wzor.call(a+e*i, c+e*j)>wysokosc
                    if @wzor.call(a+e*i, c+e*j)-wysokosc<l 
                        t+=[[a+e*i, c+e*j]]
                    end
                else
                    if wysokosc-@wzor.call(a+e*i, c+e*j)<l
                        t+=[[a+e*i, c+e*j]]
                    end
                end
                j+=1
            end
            i+=1
        end
        return t
    end
end 

funkcja=Funkcja2.new{ |x, y| x*y }
puts funkcja.value(3,4)
puts funkcja.objetosc(0, 1, 0, 1)
puts funkcja.poziomica(0,1,0,1,0)
