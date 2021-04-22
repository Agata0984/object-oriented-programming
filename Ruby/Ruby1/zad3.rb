class Jawna
    def initialize(napis)
        @napis = napis
    end
    def zaszyfruj(klucz)
        @klucz = klucz
        szyfr=""
        licznik= @napis.length()
        i=0
        while i<licznik
            if(klucz[@napis[i]]!=nil)
                szyfr+=klucz[@napis[i]]
            else 
                szyfr+=@napis[i]
            end
            i+=1
        end
        return Zaszyfrowana.new(szyfr)
    end
    def to_s()
        puts @napis
    end
end

class Zaszyfrowana
    def initialize(szyfr)
        @szyfr = szyfr
    end
    def odszyfruj(klucz)
        @klucz = klucz
        slownik=@klucz.invert
        napis=""
        licznik= @szyfr.length()
        i=0
        while i<licznik
            if(slownik[@szyfr[i]]!=nil)
                napis+=slownik[@szyfr[i]]
            else 
                napis+=@szyfr[i]
            end
            i+=1
        end
        return Jawna.new(napis)
    end
    def to_s()
        puts @szyfr
    end
end 

slowo = Jawna.new("ruby")
szyfr = slowo.zaszyfruj({ 'a' => 'b','b' => 'r','r' => 'y','y' => 'u','u' => 'a'})
szyfr.to_s()
napis = szyfr.odszyfruj({ 'a' => 'b','b' => 'r','r' => 'y','y' => 'u','u' => 'a'})
napis.to_s()
