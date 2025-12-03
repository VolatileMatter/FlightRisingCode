import Genes2 from 'wix-data';
import Colors from 'wix-data';
var debugMode = true;
var ancients = ["Banescale", "Gaoler", "Veilspun", "Aberration", "Undertide", "Aether", "Sandsurge", "Auraboa"]
var rarity = ["x", "Plentiful", "Common", "Uncommon", "Limited", "Rare"]
var elem = ["xxx", "Earth", "Plague", "Wind", "Water", "Lightning", "Ice", "Shadow", "Light", "Arcane", "Nature", "Fire"];
var eyes = ["Common", "Uncommon", "Unusual", "Rare", "Faceted", "Multi-gaze", "Primal", "Glowing", "Dark Sclera", "Goat", "Swirl", "Innocent", "Pastel", "Bright", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined"];
var gen = ["Male", "Female"];

export function Trait(frid = 0, name = "", rarity = 1, order = 0) {
    this.frid = frid;
    this.name = name;
    this.rarity = rarity;
    this.toString = function () {
        return "[frid: " + this.frid + ", name: " + this.name + ", rarity: " + this.rarity + ", " + this.order + "]";
    }
    this.order = order;
}

export class Dragon {
    constructor() {}
    toString() {
        return "" + this.breed + ", " + this.primaryGene + ", " + this.secondaryGene + ", " + this.tertiaryGene + ", " + this.primaryColor + ", " + this.secondaryColor + ", " + this.tertiaryColor;
    }
    async processScry(inp) {
        console.log(this);
        this.isAncient = false;

        //SET BREED
        if (inp.split('breed=').length > 1) {
            this.breed = await doQueryGenes("Breed", parseInt(inp.split('breed=')[1].split('&')[0]));
        } else {
            this.breed = await doQueryGenes("Breed", parseInt(inp.split('style=')[1].split('&')[0]));
        }
        if (ancients.includes(this.breed.name)) {
            this.isAncient = true;
        }
        //SET PRIG	
        if (inp.split('bodygene=').length > 1) {
            this.primaryGene = await doQueryGenes("Primary", parseInt(inp.split('bodygene=')[1].split('&')[0]), (this.isAncient) ? this.breed.name : "Modern");
        } else {
            this.primaryGene = await doQueryGenes("Primary", parseInt(inp.split('prig=')[1].split('&')[0]), (this.isAncient) ? this.breed.name : "Modern");
        }
        //SET PRIC
        this.primaryColor = await doQueryColors(parseInt(inp.split('body=')[1].split('&')[0]));
        //SET SECG
        if (inp.split('winggene=').length > 1) {
            this.secondaryGene = await doQueryGenes("Secondary", parseInt(inp.split('winggene=')[1].split('&')[0]), (this.isAncient) ? this.breed.name : "Modern");
        } else {
            this.secondaryGene = await doQueryGenes("Secondary", parseInt(inp.split('secg=')[1].split('&')[0]), (this.isAncient) ? this.breed.name : "Modern");
        }
        //SET SECC
        this.secondaryColor = await doQueryColors(parseInt(inp.split('wings=')[1].split('&')[0]));
        //SET TERG
        this.tertiaryGene = await doQueryGenes("Tertiary", parseInt(inp.split('tertgene=')[1].split('&')[0]), (this.isAncient) ? this.breed.name : "Modern");
        //SET TERC
        this.tertiaryColor = await doQueryColors(parseInt(inp.split('tert=')[1].split('&')[0]));
        //SET SEX
        this.sex = new Trait(parseInt(inp.split('gender=')[1].split('&')[0]), (parseInt(inp.split('gender=')[1].split('&')[0]) == 1) ? "Female" : "Male");
        //SET AGE
        this.age = new Trait(parseInt(inp.split('age=')[1].split('&')[0]), (parseInt(inp.split('age=')[1].split('&')[0]) == 1) ? "Adult" : "Hatchling");
        //SET ELEMENT
        this.eyeColor = new Trait(parseInt(inp.split('element=')[1].split('&')[0]), elem[parseInt(inp.split('element=')[1].split('&')[0])]);
        //SET EYE TYPE
        this.eyeType = new Trait(parseInt(inp.split('eyetype=')[1].split('&')[0]), eyes[parseInt(inp.split('eyetype=')[1].split('&')[0])]);
        //SET LINKS
        this.scryLink = "https://www1.flightrising.com/scrying/predict?breed=" + this.breed.frid + "&gender=" + this.sex.frid + "&age=" + this.age.frid +
            "&bodygene=" + this.primaryGene.frid + "&body=" + this.primaryColor.frid + "&winggene=" + this.secondaryGene.frid + "&wings=" + this.secondaryColor.frid +
            "&tertgene=" + this.tertiaryGene.frid + "&tert=" + this.tertiaryColor.frid + "&element=" + this.eyeColor.frid + "&eyetype=" + this.eyeType.frid;
        this.auctionHouseLink = "https://www1.flightrising.com/auction-house/buy/realm/dragons?d_gender=" + this.sex.frid + "&d_age=" + this.age.frid +
            "&d_breed=" + this.breed.frid + "&d_body=" + this.primaryColor.frid + "&d_wings=" + this.secondaryColor.frid + "&d_tert=" + this.tertiaryColor.frid +
            "&d_element=" + this.eyeColor.frid + "&d_eye=" + this.eyeType.frid + "&d_bodygene=" + this.primaryGene.frid + "&d_winggene=" + this.secondaryGene.frid + "&d_tertgene=" + this.tertiaryGene.frid + "&collapse=1"
        this.dragonSearchLink = "https://www1.flightrising.com/search/dragons?page=1&sort=id_asc&name=&exalted=&progen=&" +
            "breed=" + this.breed.frid + "&bodygene=" + this.primaryGene.frid + "&winggene=" + this.secondaryGene.frid + "&tertgene=" + this.tertiaryGene.frid +
            "&gender=" + this.sex.frid + "&body=" + this.primaryColor.frid + "&wings=" + this.secondaryColor.frid + "&tert=" + this.tertiaryColor.frid +
            "&element=" + this.eyeColor.frid + "&body_range=&wings_range=&tert_range=&age=1&rtb=&gen1=&pattern=&id_length=&level_min=&level_max=&eyetype=1&hibernal_cooldown_status=&ancient=&named=&hibernal=&silhouette_unlocked=&sort=id_desc&page=1"
        //COLOR PATTERN
        if (this.primaryColor == this.secondaryColor && this.secondaryColor == this.tertiaryColor) this.colorPattern = "XXX"
        if (this.primaryColor == this.secondaryColor && this.secondaryColor != this.tertiaryColor) this.colorPattern = "XXY"
        if (this.primaryColor != this.secondaryColor && this.secondaryColor == this.tertiaryColor) this.colorPattern = "XYY"
        if (this.primaryColor != this.secondaryColor && this.primaryColor == this.tertiaryColor) this.colorPattern = "XYX"
        else this.colorPattern = "XYZ"
    }
}
async function doQueryGenes(genePosition, frid, isModernOrAncientBreed = "0") {
    if (genePosition == "Breed") {
        return await Genes2.query("Genes2").contains("genePosition", genePosition).eq("frId", frid).find().then(results => {
            if (debugMode) console.log("Query results (" + genePosition + ", " + frid + ", " + isModernOrAncientBreed + "): " + results.length);
            if (results.items.length < 1) return new Trait(frid, "Unknown", 1, genePosition);
            else return new Trait(frid, results.items[0].geneName, results.items[0].rarity, results.items[0].genePosition);
        });
    } else {
        return await Genes2.query("Genes2").contains("genePosition", genePosition).eq("frId", frid).contains("breed", isModernOrAncientBreed).find().then(results => {
            if (debugMode) console.log("Query results (" + genePosition + ", " + frid + ", " + isModernOrAncientBreed + "): " + results.length);
            if (results.items.length < 1) return new Trait(frid, "Unknown", 1, genePosition);
            else return new Trait(frid, results.items[0].geneName, results.items[0].rarity, results.items[0].genePosition);
        });
    }
}

async function doQueryColors(num = 0, isFrid = true) {
    if (isFrid) {
        return await Colors.query("Colors").eq("frId", num).find().then(results => {
            if (debugMode) console.log("Query results (" + num + ", " + isFrid + "): " + results.length);
            if (results.items.length < 1) return new Trait(num, "Unknown");
            else return new Trait(results.items[0].frId, results.items[0].color, 0, results.items[0].order);
        })
    } else {
        return await Colors.query("Colors").eq("order", parseInt(num)).find().then(results => {
            if (debugMode) console.log("Query results (" + num + ", " + isFrid + "): " + results.length);
            if (results.items.length < 1) return new Trait(num, "Unknown");
            else return new Trait(results.items[0].frId, results.items[0].color, 0, results.items[0].order);
        })
    }
}
async function doQueryColorsN(color) {
    return await Colors.query("Colors").contains("color", color).find().then(results => {
        if (debugMode) console.log("Query results (" + color + "): " + results.length);
        if (results.items.length < 1) return new Trait(0, "Unknown");
        else return new Trait(results.items[0].frId, results.items[0].color, 0, results.items[0].order);
    })
}

export class Breeder {
    constructor() {}
    async process(mother = new Dragon(), father = new Dragon()) {
        this.chanceMotherBreed = this.getRarityPercent(mother.breed, father.breed);
        this.chanceFatherBreed = this.getRarityPercent(father.breed, mother.breed);
        this.chanceMotherPrig = this.getRarityPercent(mother.primaryGene, father.primaryGene);
        this.chanceFatherPrig = this.getRarityPercent(father.primaryGene, mother.primaryGene);
        this.chanceMotherSecg = this.getRarityPercent(mother.secondaryGene, father.secondaryGene);
        this.chanceFatherSecg = this.getRarityPercent(father.secondaryGene, mother.secondaryGene);
        this.chanceMotherTerg = this.getRarityPercent(mother.tertiaryGene, father.tertiaryGene);
        this.chanceFatherTerg = this.getRarityPercent(father.tertiaryGene, mother.tertiaryGene);

        this.primaryColors = await this.createColorRange(mother.primaryColor, father.primaryColor);
        this.secondaryColors = await this.createColorRange(mother.secondaryColor, father.secondaryColor);
        this.tertiaryColors = await this.createColorRange(mother.tertiaryColor, father.tertiaryColor);
    }
    getRarityPercent(a, b) {
        if (a.rarity === 1) {
            switch (b.rarity) {
            case 1:
                return 50;
            case 2:
                return 70;
            case 3:
                return 85;
            case 4:
                return 97;
            case 5:
                return 99;
            }
        }
        if (a.rarity === 2) {
            switch (b.rarity) {
            case 1:
                return 30;
            case 2:
                return 50;
            case 3:
                return 75;
            case 4:
                return 90;
            case 5:
                return 99;
            }
        }
        if (a.rarity === 3) {
            switch (b.rarity) {
            case 1:
                return 15;
            case 2:
                return 25;
            case 3:
                return 50;
            case 4:
                return 85;
            case 5:
                return 98;
            }
        }
        if (a.rarity === 4) {
            switch (b.rarity) {
            case 1:
                return 3;
            case 2:
                return 10;
            case 3:
                return 15;
            case 4:
                return 50;
            case 5:
                return 97;
            }
        }
        switch (b.rarity) {
        case 1:
            return 1;
        case 2:
            return 1;
        case 3:
            return 2;
        case 4:
            return 3;
        case 5:
            return 50;
        }
        return 0;
    }
    async createColorRange(m = new Trait(0, ""), d = new Trait(0, "")) {
        console.log("createColorRange: [m, " + m.toString() + "] [d, " + d.toString() + "]")
        var max = (m.order > d.order) ? m : d;
        var min = (m.order < d.order) ? m : d;
        if (max.order - min.order < 89) {
            return await doQueryColorRange(min, max);
        } else {
            var t1 = await doQueryColorRange(max, new Trait(0, "Pearl", 0, 177));
            var t2 = await doQueryColorRange(new Trait(0, "Maize", 0, 1), min)
            for (var i = 0; i < t2.length; i++) {
                t1.push(t2[i])
            }
            return t1;
        }
    }
    colorRangeToString(gene, divider, font, numPerLine) {
        var range = this.primaryColors;
        if (gene == 1) range = this.primaryColors;
        if (gene == 2) range = this.secondaryColors;
        if (gene == 3) range = this.tertiaryColors;
        //console.log(this.primaryColors+"|"+this.secondaryColors+"|"+this.tertiaryColors)
        var b = ["▏", "▎", "▍", "█"];
        var r = "";
        if (debugMode) console.log("colorRangeToString: b[" + divider + "] + rangeLen:" + Number(range.length));
        r += "[font=" + font + "]";
        for (var i = 0; i < range.length; i++) {
            r += "[color=" + range[i].hex + "]" + divider + "[/color]"
            if ((i + 1) % numPerLine == 0) r += "\n";
        }
        r += "[/font]";
        return r;
    }
}
async function doQueryColorRange(min, max) {
    return await Colors.query("Colors").ascending("order").limit(200).ge("order", parseInt(min.order)).le("order", parseInt(max.order)).find().then(results => {
        if (debugMode) console.log("Query results (" + min + ", " + max + "): " + results.length);
        return results.items;
    })
}
