db.runCommand(
    {callMod:'nonFiction', 
    validator: {
        $jsonSchema: {
            required: ["name", "price","authors"],
            properties: {
                name: {
                    bsonType: "string",
                    description: "must be a string and is required"
                },
                price: {
                    bsonType: "number",
                    description: "must be a number and is required"
                },
                authors:{
                    bsonType:'array',
                    description:'must be an array and is required',
                    items:{
                        bsonType:'object',
                        required:['name','email'],
                        properties:{
                            name:{
                                bsonType:'string'
                            },
                            email:{
                                bsonType:'string'
                            }
                        }
                    }
                }
            }
        }
    },
    validationAction: "error"
})