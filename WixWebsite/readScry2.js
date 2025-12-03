// Filename: public/readScry2.js

import Genes2 from 'wix-data';
import Colors from 'wix-data';
var ancients = ["Banescale", "Gaoler", "Veilspun", "Aberration", "Undertide", "Auraboa"]

var elem = ["xxx", "Earth", "Plague", "Wind", "Water", "Lightning", "Ice", "Shadow", "Light", "Arcane", "Nature", "Fire"];
var eyes = ["Common", "Uncommon", "Unusual", "Rare", "Faceted", "Multi-gaze", "Primal", "Glowing", "Dark Sclera", "Goat", "Swirl", "Innocent", "Pastel", "Bright", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined", "Undefined"];
var gen = ["Male", "Female"];

var colors = ["Maize", "White", "Ice", "Platinum", "Silver", "Grey", "Charcoal", "Coal", "Black", "Obsidian", "Midnight", "Shadow", "Mulberry", "Thistle", "Lavender", "Purple", "Violet", "Royal", "Storm", "Navy", "Blue", "Splash", "Sky", "Stonewash", "Steel", "Denim", "Azure", "Caribbean", "Teal", "Aqua", "Seafoam", "Jade", "Emerald", "Jungle", "Forest", "Swamp", "Avocado", "Green", "Leaf", "Spring", "Goldenrod", "Lemon", "Banana", "Ivory", "Gold", "Sunshine", "Orange", "Fire", "Tangerine", "Sand", "Beige", "Stone", "Slate", "Soil", "Brown", "Chocolate", "Rust", "Tomato", "Crimson", "Blood", "Maroon", "Red", "Carmine", "Coral", "Magenta", "Pink", "Rose", "Heather", "Orchid", "Oilslick", "Sapphire", "Wine", "Mauve", "Moon", "Marigold", "Tan", "Cinnamon", "Spearmint", "Mantis", "Shamrock", "Hunter", "Iris", "Bronze", "Saffron", "Pearl", "Ruby", "Berry", "Hickory", "Cyan", "Ultramarine", "Smoke", "Plum", "Honey", "Copper", "Taupe", "Abyss", "Antique", "Gloom", "Robin", "Spruce", "Pear", "Honeydew", "Amber", "Yellow", "Peach", "Clay", "Brick", "Terracotta", "Bubblegum", "Sanddollar", "Eggplant", "Indigo", "Fern", "Amethyst", "Moss", "Cherry", "Cerulean", "Lead", "Wisteria", "Watermelon", "Sanguine", "Ginger", "Olive", "Tarnish", "Pistachio", "Overcast", "Blackberry", "Grapefruit", "Flint", "Radioactive", "Orca", "Cerise", "Carrot", "Peacock", "Periwinkle", "Cobalt", "Fog", "Sable", "Flaxen", "Metals", "Thicket", "Murk", "Latte", "Peridot", "Cornflower", "Dust", "Grape", "Lapis", "Turquoise", "Mist", "Phthalo", "Mint", "Algae", "Camo", "Chartreuse", "Caramel", "Umber", "Pumpkin", "Blush", "Raspberry", "Garnet", "Dirt", "Cream", "CottonCandy", "Driftwood", "Auburn", "Buttercup", "Strawberry", "Vermillion", "Fuchsia", "Cantaloupe", "Sunset", "Crocodile", "Twilight", "Nightshade", "Eldritch", "Shale"];
var colorsO = ["x", "Maize", "White", "Ice", "Platinum", "Silver", "Grey", "Charcoal", "Coal", "Black", "Obsidian", "Midnight", "Shadow", "Mulberry", "Thistle", "Lavender", "Purple", "Violet", "Royal", "Storm", "Navy", "Blue", "Splash", "Sky", "Stonewash", "Steel", "Denim", "Azure", "Caribbean", "Teal", "Aqua", "Seafoam", "Jade", "Emerald", "Jungle", "Forest", "Swamp", "Avocado", "Green", "Leaf", "Spring", "Goldenrod", "Lemon", "Banana", "Ivory", "Gold", "Sunshine", "Orange", "Fire", "Tangerine", "Sand", "Beige", "Stone", "Slate", "Soil", "Brown", "Chocolate", "Rust", "Tomato", "Crimson", "Blood", "Maroon", "Red", "Carmine", "Coral", "Magenta", "Pink", "Rose", "Heather", "Orchid", "Oilslick", "Sapphire", "Wine", "Mauve", "Moon", "Marigold", "Tan", "Cinnamon", "Spearmint", "Mantis", "Shamrock", "Hunter", "Iris", "Bronze", "Saffron", "Pearl", "Ruby", "Berry", "Hickory", "Cyan", "Ultramarine", "Smoke", "Plum", "Honey", "Copper", "Taupe", "Abyss", "Antique", "Gloom", "Robin", "Spruce", "Pear", "Honeydew", "Amber", "Yellow", "Peach", "Clay", "Brick", "Terracotta", "Bubblegum", "Sanddollar", "Eggplant", "Indigo", "Fern", "Amethyst", "Moss", "Cherry", "Cerulean", "Lead", "Wisteria", "Watermelon", "Sanguine", "Ginger", "Olive", "Tarnish", "Pistachio", "Overcast", "Blackberry", "Grapefruit", "Flint", "Radioactive", "Orca", "Cerise", "Carrot", "Peacock", "Periwinkle", "Cobalt", "Fog", "Sable", "Flaxen", "Metals", "Thicket", "Murk", "Latte", "Peridot", "Cornflower", "Dust", "Grape", "Lapis", "Turquoise", "Mist", "Phthalo", "Mint", "Algae", "Camo", "Chartreuse", "Caramel", "Umber", "Pumpkin", "Blush", "Raspberry", "Garnet", "Dirt", "Cream", "CottonCandy", "Driftwood", "Auburn", "Buttercup", "Strawberry", "Vermillion", "Fuchsia", "Cantaloupe", "Sunset", "Crocodile", "Twilight", "Nightshade", "Eldritch", "Shale"];
var colorsN = ["x", "Maize", "Cream", "Antique", "White", "Moon", "Ice", "Orca", "Platinum", "Silver", "Dust", "Grey", "Smoke", "Gloom", "Lead", "Shale", "Flint", "Charcoal", "Coal", "Oilslick", "Black", "Obsidian", "Eldritch", "Midnight", "Shadow", "Blackberry", "Mulberry", "Plum", "Wisteria", "Thistle", "Fog", "Mist", "Lavender", "Heather", "Purple", "Orchid", "Amethyst", "Nightshade", "Violet", "Grape", "Royal", "Eggplant", "Iris", "Storm", "Twilight", "Indigo", "Sapphire", "Navy", "Cobalt", "Ultramarine", "Blue", "Periwinkle", "Lapis", "Splash", "Cornflower", "Sky", "Stonewash", "Overcast", "Steel", "Denim", "Abyss", "Phthalo", "Azure", "Caribbean", "Teal", "Cerulean", "Cyan", "Robin", "Aqua", "Turquoise", "Spruce", "Pistachio", "Seafoam", "Mint", "Jade", "Spearmint", "Thicket", "Peacock", "Emerald", "Shamrock", "Jungle", "Hunter", "Forest", "Camo", "Algae", "Swamp", "Avocado", "Green", "Fern", "Mantis", "Pear", "Leaf", "Radioactive", "Honeydew", "Peridot", "Chartreuse", "Spring", "Crocodile", "Olive", "Murk", "Moss", "Goldenrod", "Amber", "Honey", "Lemon", "Yellow", "Grapefruit", "Banana", "Sanddollar", "Flaxen", "Ivory", "Buttercup", "Gold", "Metals", "Marigold", "Sunshine", "Saffron", "Sunset", "Peach", "Cantaloupe", "Orange", "Bronze", "Terracotta", "Carrot", "Fire", "Pumpkin", "Tangerine", "Cinnamon", "Caramel", "Sand", "Tan", "Beige", "Stone", "Taupe", "Slate", "Driftwood", "Latte", "Dirt", "Clay", "Sable", "Umber", "Soil", "Hickory", "Tarnish", "Ginger", "Brown", "Chocolate", "Auburn", "Copper", "Rust", "Tomato", "Vermillion", "Ruby", "Cherry", "Crimson", "Garnet", "Sanguine", "Blood", "Maroon", "Berry", "Red", "Strawberry", "Cerise", "Carmine", "Brick", "Coral", "Blush", "CottonCandy", "Watermelon", "Magenta", "Fuchsia", "Raspberry", "Wine", "Mauve", "Pink", "Bubblegum", "Rose", "Pearl"]

var debugMode = true;

var a = {
    sex: "null",
    element: "null",
    breed: "null",
    primaryColor: "null",
    primaryGene: "null",
    secondaryColor: "null",
    secondaryGene: "null",
    tertiaryColor: "null",
    tertiaryGene: "null",
    eyeType: "null",
    age: "null",
    breedType: "null",
    sexid: 0,
    elementid: 0,
    breedid: 0,
    pcid: 0,
    pgid: 0,
    scid: 0,
    sgid: 0,
    tcid: 0,
    tgid: 0,
    etid: 0,
    ageid: 0,
    colorsOnly: false,
    toString: function () {
        if(!this.colorsOnly){
        return "Sex: " + this.sex + ", Element: " + this.element + ", Eye type: " + this.eyeType + ", Breed: " + this.breed + ", Breed Type: " + this.breedType +
            ", Primary Gene: " + this.primaryGene + ", Primary Color: " + this.primaryColor +
            ", Secondary Gene: " + this.secondaryGene + ", Secondary Color: " + this.secondaryColor +
            ", Tertiary Gene: " + this.tertiaryGene + ", Tertiary Color: " + this.tertiaryColor +
            ", Age: " + this.age
        }
        else {
            return this.primaryColor + "/"+this.secondaryColor+"/"+this.tertiaryColor
        }
    },
    toStringNoLabels: function () {
        if(!this.colorsOnly){
        return this.age + " " + this.sex + " " + this.eyeType + " " + this.element + " " + this.breed + ". " + this.primaryGene + " " + this.primaryColor +
            ", " + this.secondaryGene + " " + this.secondaryColor + ", " + this.tertiaryGene + " " + this.tertiaryColor
        }
        else {
             return this.primaryColor + "/"+this.secondaryColor+"/"+this.tertiaryColor
        }
    },
    toAHLink: function () {
        if(!this.colorsOnly){
        return "https://www1.flightrising.com/auction-house/buy/realm/dragons?d_gender=" +
            this.sexid + "&d_breed=" + this.breedid + "&d_body=" + this.pcid + "&d_wings=" + this.scid + "&d_tert=" +
            this.tcid + "&d_element=" + this.elementid + "&d_eye=" + this.etid + "&d_bodygene=" +
            this.pgid + "&d_winggene=" + this.sgid + "&d_tertgene=" + this.tgid + "&d_age=" + this.ageid +
            "&collapse=1"
        } else {
            return "https://www1.flightrising.com/auction-house/buy/realm/dragons?"+
            "&d_body=" + this.pcid + "&d_wings=" + this.scid + "&d_tert=" +
            this.tcid + "&collapse=1"
        }
    },
    toSearchLink: function () {
        if(!this.colorsOnly){
        return "https://www1.flightrising.com/search/dragons?page=1&sort=id_asc&name=&exalted=0&progen=&breed=" +
            this.breedid + "&bodygene=" + this.pgid + "&winggene=" + this.sgid + "&tertgene=" + this.tgid +
            "&gender=" + this.sexid + "&body=" + this.pcid + "&wings=" + this.scid + "&tert=" + this.tcid + "&element=" + this.elementid +
            "&body_range=&wings_range=&tert_range=&age=&rtb=&gen1=&pattern=&id_length=&level_min=&level_max=&eyetype=" +
            this.etid + "&hibernal_cooldown_status=&ancient=&named=&hibernal=&silhouette_unlocked=&sort=id_desc&page=1"
        }
        else {
            return "https://www1.flightrising.com/search/dragons?page=1&sort=id_asc&name=&exalted=0&progen="+
            "&body=" + this.pcid + "&wings=" + this.scid + "&tert=" + this.tcid +
            "&body_range=&wings_range=&tert_range=&age=&rtb=&gen1=&pattern=&id_length=&level_min=&level_max="+
            "&hibernal_cooldown_status=&ancient=&named=&hibernal=&silhouette_unlocked=&sort=id_desc&page=1"
        }
    },
    toScryLink: function () {
        return "https://www1.flightrising.com/scrying/predict?breed=" + this.breedid +
            "&gender=" + this.sexid + "&age=" + this.ageid + "&bodygene=" + this.pgid + "&body=" + this.pcid + "&winggene=" + this.sgid +
            "&wings=" + this.scid + "&tertgene=" + this.tgid + "&tert=" + this.tcid + "&element=" + this.elementid +
            "&eyetype=" + this.etid
    },
    toSymmetricalRangeAHLink: async function (pstep, sstep, tstep) {
        var p = await generateSymmetricalColorRange(this.primaryColor, pstep);
        var s = await generateSymmetricalColorRange(this.secondaryColor, sstep);
        var t = await generateSymmetricalColorRange(this.tertiaryColor, tstep);
        return "https://www1.flightrising.com/auction-house/buy/realm/dragons?" +
            "d_body=" + p + "&d_wings=" + s + "&d_tert=" + t +
            "&collapse=1";
    },
    toSymmetricalRangeSearchLink: async function (pstep, sstep, tstep) {
        var p = await generateSymmetricalColorRange(this.primaryColor, pstep);
        var s = await generateSymmetricalColorRange(this.secondaryColor, sstep);
        var t = await generateSymmetricalColorRange(this.tertiaryColor, tstep);
        return "https://www1.flightrising.com/search/dragons?page=1&sort=id_asc&name=&exalted=0&progen=0&breed=&bodygene=&winggene=&tertgene=&gender=" +
            "&body=" + p +
            "&wings=" + s +
            "&tert=" + t +
            "&element=&body_range=&wings_range=&tert_range=&age=&rtb=&gen1=&pattern=&id_length=&level_min=&level_max=&eyetype=&hibernal_cooldown_status=&ancient=&named=&hibernal=&silhouette_unlocked=&sort=id_desc&page=1"
    },
    oppositeColorCWAHLink: async function () {
        var temp = await this.oppositeColorCW();
        return "https://www1.flightrising.com/auction-house/buy/realm/dragons?d_gender=" +
            this.getOppositeSex() + "&d_body=" + temp.pi + "&d_wings=" + temp.si +
            "&d_tert=" + temp.ti +
            "&collapse=1"
    },
    oppositeColorCCWAHLink: async function () {
        var temp = await this.oppositeColorCCW();
        return "https://www1.flightrising.com/auction-house/buy/realm/dragons?d_gender=" +
            this.getOppositeSex() + "&d_body=" + temp.pi + "&d_wings=" + temp.si +
            "&d_tert=" + temp.ti +
            "&collapse=1"
    },
    oppositeColorCWSearchLink: async function () {
        var temp = await this.oppositeColorCW();
        return "https://www1.flightrising.com/search/dragons?page=1&sort=id_asc&name=&exalted=0&progen=0&breed=&bodygene=&winggene=&tertgene=&gender=" +
            "&body=" + temp.p + "&wings=" + temp.s + "&tert=" + temp.t +
            "&element=&body_range=&wings_range=&tert_range=&age=&rtb=&gen1=&pattern=&id_length=&level_min=&level_max=&eyetype=&hibernal_cooldown_status=&ancient=&named=&hibernal=&silhouette_unlocked=&sort=id_desc&page=1"
    },
    oppositeColorCCWSearchLink: async function () {
        var temp = await this.oppositeColorCCW();
        return "https://www1.flightrising.com/search/dragons?page=1&sort=id_asc&name=&exalted=0&progen=0&breed=&bodygene=&winggene=&tertgene=&gender=" +
            "&body=" + temp.p + "&wings=" + temp.s + "&tert=" + temp.t +
            "&element=&body_range=&wings_range=&tert_range=&age=&rtb=&gen1=&pattern=&id_length=&level_min=&level_max=&eyetype=&hibernal_cooldown_status=&ancient=&named=&hibernal=&silhouette_unlocked=&sort=id_desc&page=1"
    },
    oppositeColorCWScryLink: async function() {
        var temp = await this.oppositeColorCW();
        return "https://www1.flightrising.com/scrying/predict?breed=" + this.breedid +
            "&gender=" + this.getOppositeSex() + "&age=" + this.ageid + "&bodygene=" + this.pgid + "&body=" + temp.pi + "&winggene=" + this.sgid +
            "&wings=" + temp.si + "&tertgene=" + this.tgid + "&tert=" + temp.ti + "&element=" + this.elementid +
            "&eyetype=" + this.etid
    },
    oppositeColorCCWScryLink: async function() {
        var temp = await this.oppositeColorCCW();
        return "https://www1.flightrising.com/scrying/predict?breed=" + this.breedid +
            "&gender=" + this.getOppositeSex() + "&age=" + this.ageid + "&bodygene=" + this.pgid + "&body=" + temp.pi + "&winggene=" + this.sgid +
            "&wings=" + temp.si + "&tertgene=" + this.tgid + "&tert=" + temp.ti + "&element=" + this.elementid +
            "&eyetype=" + this.etid
    },
    getOppositeSex: function () {
        if (parseInt(this.sex) === 0) return 1;
        else return 0;
    },
    toFindParentAHLink: async function (tpc, tsc, ttc, steps) {
        var p = await generateAsymColorRange(this.primaryColor, steps, tpc);
        var s = await generateAsymColorRange(this.secondaryColor, steps, tsc);
        var t = await generateAsymColorRange(this.tertiaryColor, steps, ttc);
        return "https://www1.flightrising.com/auction-house/buy/realm/dragons?" +
            "d_body=" + p + "&d_wings=" + s + "&d_tert=" + t +
            "&collapse=1";
    },
    toFindParentSearchLink: async function (tpc, tsc, ttc, steps) {
        var p = await generateAsymColorRange(this.primaryColor, steps, tpc);
        var s = await generateAsymColorRange(this.secondaryColor, steps, tsc);
        var t = await generateAsymColorRange(this.tertiaryColor, steps, ttc);
        return "https://www1.flightrising.com/search/dragons?page=1&sort=id_asc&name=&exalted=0&progen=0&breed=&bodygene=&winggene=&tertgene=&gender=" +
            "&body=" + p +
            "&wings=" + s +
            "&tert=" + t +
            "&element=&body_range=&wings_range=&tert_range=&age=&rtb=&gen1=&pattern=&id_length=&level_min=&level_max=&eyetype=&hibernal_cooldown_status=&ancient=&named=&hibernal=&silhouette_unlocked=&sort=id_desc&page=1"
    },
    oppositeColorCW: async function () {
        var ret = { pi: 0, si: 0, ti: 0, pc: "White", sc: "Grey", tc: "Black", po: 0, so: 0, to: 0 }
        var pcorder = 0;
        //Primary Color
        await Colors.query("Colors").eq("color", this.primaryColor).find().then(results => {
            pcorder = results.items[0].order
        })
        ret.pi = pcorder + 89;
        if (ret.pi > 177) {
            ret.pi -= 178;
        }
        await Colors.query("Colors").eq("order", ret.pi).find().then(results => {
            if(results.items.length === 0) console.log("query failed: ret.pi: "+ret.pi)
            ret.po = ret.pi
            ret.pi = results.items[0].frId
            ret.pc = results.items[0].color
        })
        //Secondary Color
        var scorder = 0;
        await Colors.query("Colors").eq("color", this.secondaryColor).find().then(results => {
            scorder = results.items[0].order
        })
        ret.si = scorder + 89;
        if (ret.si > 177) {
            ret.si -= 178;
        }
        await Colors.query("Colors").eq("order", ret.si).find().then(results => {
            ret.so = ret.si
            ret.si = results.items[0].frId
            ret.sc = results.items[0].color
        })
        //Tertiary Color
        var tcorder = 0;
        await Colors.query("Colors").eq("color", this.tertiaryColor).find().then(results => {
            tcorder = results.items[0].order
        })
        ret.ti = tcorder + 89;
        if (ret.ti > 177) {
            ret.ti -= 178;
        }
        await Colors.query("Colors").eq("order", ret.ti).find().then(results => {
            ret.to = ret.ti
            ret.ti = results.items[0].frId
            ret.tc = results.items[0].color
        })
        return ret;
    },
    oppositeColorCCW: async function () {
        var ret = { pi: 0, si: 0, ti: 0, pc: "White", sc: "Grey", tc: "Black", po: 0, so: 0, to: 0 }
        var pcorder = 0;
        //Primary Color
        await Colors.query("Colors").eq("color", this.primaryColor).find().then(results => {
            pcorder = results.items[0].order
        })
        ret.pi = pcorder + 88;
        if (ret.pi > 177) {
            ret.pi -= 176;
        }
        await Colors.query("Colors").eq("order", ret.pi).find().then(results => {
            ret.po = ret.pi
            ret.pi = results.items[0].frId
            ret.pc = results.items[0].color
        })
        //Secondary Color
        var scorder = 0;
        await Colors.query("Colors").eq("color", this.secondaryColor).find().then(results => {
            scorder = results.items[0].order
        })
        ret.si = scorder + 88;
        if (ret.si > 177) {
            ret.si -= 176;
        }
        await Colors.query("Colors").eq("order", ret.si).find().then(results => {
            ret.so = ret.si
            ret.si = results.items[0].frId
            ret.sc = results.items[0].color
        })
        //Tertiary Color
        var tcorder = 0;
        await Colors.query("Colors").eq("color", this.tertiaryColor).find().then(results => {
            tcorder = results.items[0].order
        })
        ret.ti = tcorder + 88;
        if (ret.ti > 177) {
            ret.ti -= 176;
        }
        await Colors.query("Colors").eq("order", ret.ti).find().then(results => {
            ret.to = ret.ti
            ret.ti = results.items[0].frId
            ret.tc = results.items[0].color
        })

        return ret
    }
}
async function generateAsymColorRange(color, step, target) {
    var oh = await getOrderFromName(await color);
    var ot = await getOrderFromName(await target);
    if (oh - ot > 88 || oh - ot < -88) {
         if (oh > ot) {
            return generateColorRange(target, await getNameFromOrder(await ot - step));
        } else {
            return generateColorRange(target, await getNameFromOrder(await ot + step));
        }
    } else {
        if (oh > ot) {
            return generateColorRange(target, await getNameFromOrder(await ot + step));
        } else {
            return generateColorRange(target, await getNameFromOrder(await ot - step));
        }
    }
}
async function generateSymmetricalColorRange(color, steps) {
    //console.log("color: " + color + ", steps: " + steps);
    var pcorder = 0;
    var rets = "";
    var ret = { top: 0, bot: 0 };
    await Colors.query("Colors").eq("color", color).find().then(results => {
        pcorder = results.items[0].order
    })
    ret.top = pcorder - steps;
    ret.bot = pcorder + steps;
    if (ret.top < 1) {
        if (ret.top < 1)
            ret.top = 177 + ret.top;
        //console.log("pcorder: " + pcorder + ", top order: " + ret.top + ", bot order: " + ret.bot);
        await Colors.query("Colors").ge("order", ret.top).find().then(results => {
            for (var i = 0; i < results.items.length; i++) {
                rets += results.items[i].frId
                rets += "%2C"
            }
        });
        await Colors.query("Colors").le("order", ret.bot).find().then(results => {
            for (var i = 0; i < results.items.length; i++) {
                rets += results.items[i].frId
                if (i + 1 < results.items.length)
                    rets += "%2C"
            }
        });
    } else if (ret.bot > 177) {
        if (ret.bot > 177)
            ret.bot = ret.bot - 177;
        //console.log("pcorder: " + pcorder + ", top order: " + ret.top + ", bot order: " + ret.bot);
        await Colors.query("Colors").ge("order", ret.top).find().then(results => {
            for (var i = 0; i < results.items.length; i++) {
                rets += results.items[i].frId
                if (i + 1 < results.items.length)
                    rets += "%2C"
            }
        });
        await Colors.query("Colors").le("order", ret.bot).find().then(results => {
            rets += "%2C";
            for (var i = 0; i < results.items.length; i++) {
                rets += results.items[i].frId
                if (i + 1 < results.items.length)
                    rets += "%2C"
            }
        });
    } else {
        ret.bot += 1;
        //console.log("pcorder: " + pcorder + ", top order: " + ret.top + ", bot order: " + ret.bot);
        await Colors.query("Colors").between("order", ret.top, ret.bot).find().then(results => {
            for (var i = 0; i < results.items.length; i++) {
                rets += results.items[i].frId
                if (i + 1 < results.items.length)
                    rets += "%2C"
            }
        })
    }
    return rets;
}
async function generateColorRange(color1, color2) {
    var color1o = await getOrderFromName(await color1);
    var color2o = await getOrderFromName(await color2);
    var rets = "";
    var top = color1o;
    var bot = color2o;
    if (color1o < color2o) {
        top = color2o;
        bot = color1o;
    }
    if (top - bot > 88) {
        //wraps around
        await Colors.query("Colors").ge("order", top).find().then(results => {
            for (var i = 0; i < results.items.length; i++) {
                rets += results.items[i].frId
                rets += "%2C"
            }
        });
        await Colors.query("Colors").le("order", bot).find().then(results => {
            for (var i = 0; i < results.items.length; i++) {
                rets += results.items[i].frId
                if (i + 1 < results.items.length)
                    rets += "%2C"
            }
        });
    } else {
        //does not wrap around
        await Colors.query("Colors").between("order", top, bot).find().then(results => {
            for (var i = 0; i < results.items.length; i++) {
                rets += results.items[i].frId
                if (i + 1 < results.items.length)
                    rets += "%2C"
            }
        })
    }
    return rets;
}
async function getOrderFromName(color) {
    var ret = 0;
    await Colors.query("Colors").eq("color", color).find().then(results => {
        if(results.items.length === 0)
            console.log("Did not match: "+color);
        ret = results.items[0].order
    })
    return await parseInt(await ret);
}
async function getNameFromOrder(order) {
    var ret = 0;
    if(order > 177)
        order -= 177;
    if(order < 1)
        order += 177;
    await Colors.query("Colors").eq("order", order).find().then(results => {
        ret = results.items[0].order
    })
    return parseInt(await ret);
}
export async function getFullScryArray(inp) {
    var queryResults = [];
    var temp = 0;
    //=========== ID PARSING =========
    a.ageid = inp.split('age=')[1].split('&')[0];
    a.sexid = parseInt(inp.split('gender=')[1].split('&')[0]);
    if (inp.split('element=').length > 1) {
        a.elementid = parseInt(inp.split('element=')[1].split('&')[0]);
    } else {
        a.elementid = parseInt(inp.split('elem=')[1].split('&')[0]);
    }
    if (inp.split('breed=').length > 1) {
        a.breedid = parseInt(inp.split('breed=')[1].split('&')[0]);
    } else {
        a.breedid = parseInt(inp.split('style=')[1].split('&')[0]);
    }
    a.pcid = parseInt(inp.split('body=')[1].split('&')[0]);
    if (inp.split('bodygene=').length > 1) {
        a.pgid = parseInt(inp.split('bodygene=')[1].split('&')[0]);
    } else {
        a.pgid = parseInt(inp.split('prig=')[1].split('&')[0]);
    }
    if (inp.split('wings=').length > 1) {
        a.scid = parseInt(inp.split('wings=')[1].split('&')[0]);
    } else {
        a.scid = parseInt(inp.split('wing=')[1].split('&')[0]);
    }
    if (inp.split('winggene=').length > 1) {
        a.sgid = parseInt(inp.split('winggene=')[1].split('&')[0]);
    } else {
        a.sgid = parseInt(inp.split('secg=')[1].split('&')[0]);
    }
    a.tcid = parseInt(inp.split('tert=')[1].split('&')[0]);
    a.tgid = parseInt(inp.split('tertgene=')[1].split('&')[0]);
    a.etid = parseInt(inp.split('eyetype=')[1].split('&')[0]);
    //=========== WORD PARSING =======
    //Gender
    a.sex = gen[a.sexid];
    //Element
    a.element = elem[a.elementid]
    //Breed
    await Genes2.query("Genes2").contains("genePosition", "Breed").eq("frId", a.breedid).find().then(results => {
        queryResults = results.items
    });
    if (await queryResults.length > 0) {
        a.breed = await queryResults[0].geneName;
    } else { a.breed = "[Breed " + a.breedid + " is not in database.]"; }
    if (!ancients.includes(await a.breed)) a.breedType = "Modern";
    else a.breedType = a.breed;
    //Primary Color
    a.primaryColor = colors[a.pcid - 1];
    for(let i=0; i<colorsN.length; i++){
        if(colorsN[i] === a.primaryColor){
            a.po = i;
            break;
        }
    }
    //Primary Gene
    await Genes2.query("Genes2").contains("genePosition", "Primary").eq("frId", a.pgid).contains("breed", a.breedType).find().then(results => {
        queryResults = results.items
    })
    if (await queryResults.length > 0) {
        a.primaryGene = queryResults[0].geneName;
    } else {
        a.primaryGene = "[Primary gene " + a.pgid + " is not in database.]";
    }
    //Secondary Color
    a.secondaryColor = colors[a.scid - 1]
    for(let i=0; i<colorsN.length; i++){
        if(colorsN[i] === a.secondaryColor){
            a.so = i;
            break;
        }
    }
    //Secondary Gene
    await Genes2.query("Genes2").contains("genePosition", "Secondary").eq("frId", a.sgid).contains("breed", a.breedType).find().then(results => {
        queryResults = results.items
    })
    if (await queryResults.length > 0) {
        a.secondaryGene = queryResults[0].geneName;
    } else {
        a.secondaryGene = "[Secondary gene " + a.sgid + " is not in database.]";
    }
    //Tertiary Color
    a.tertiaryColor = colors[a.tcid - 1]
    for(let i=0; i<colorsN.length; i++){
        if(colorsN[i] === a.tertiaryColor){
            a.to = i;
            break;
        }
    }
    //Tertiary Gene
    await Genes2.query("Genes2").contains("genePosition", "Tertiary").eq("frId", a.tgid).contains("breed", a.breedType).find().then(results => {
        queryResults = results.items
    })
    if (await queryResults.length > 0) {
        a.tertiaryGene = queryResults[0].geneName;
    } else {
        a.tertiaryGene = "[Tertiary gene " + a.tgid + " is not in database.]";
    }
    //Eye Type
    a.eyeType = eyes[a.etid]
    //Age
    if (a.ageid == 1)
        a.age = "Adult";
    else a.age = "Hatchling";
    //Done
    return a;
}
