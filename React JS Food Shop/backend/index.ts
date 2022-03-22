import express, { Application, json, Request, Response } from "express";
import { UserModel, Database, ProductModel, OrderModel } from "./Models";
import fs from "fs";
const app: Application = express();
const port = 3001;
// Body parsing Middleware
app.use(express.json());
app.use(express.urlencoded({ extended: true }));
app.use(function (req, res, next) {

	// Website you wish to allow to connect
	res.setHeader('Access-Control-Allow-Origin', 'http://localhost:3000');

	// Request methods you wish to allow
	res.setHeader('Access-Control-Allow-Methods', 'GET, POST, PUT, OPTIONS,PATCH, DELETE');

	// Request headers you wish to allow
	res.setHeader('Access-Control-Allow-Headers', 'X-Requested-With,content-type');

	// Set to true if you need the website to include cookies in the requests sent
	// to the API (e.g. in case you use sessions)
	res.setHeader('Access-Control-Allow-Credentials', "true");

	// Pass to next layer of middleware
	next();
});
app.options('*', function (req, res) { res.sendStatus(200); });


app.post('/test', (req: any, res: any) => {
	const { param1, param2 } = req.body;
	fs.readFile("./data/presaved.json", 'utf8', (err: any, data: any) => {
		if (err) {
			res.status(200).send({ message: "Failed" })
			throw err;
		}
		const db: Database | null = JSON.parse(data);
		if (db)
			if (db) {
				for (let i = 0; i < db.user.length; i++) {
					if (db.user[i].username == param1 && db.user[i].password == param2) {
						res.status(200).send(db.user[i]);
						return;
					}
				}
				//console.log(db.user[db.user.length].username);
				res.status(200).send({ message: "Login Failed. Try introducing the right username and password." });



			}

	});
});

app.post('/test2', (req: any, res: any) => {
	const { param3, param4, param5 } = req.body;
	fs.readFile("./data/presaved.json", 'utf8', (err: any, data: any) => {
		if (err) {
			res.status(200).send({ message: "Failed" })
			throw err;
		}
		const database: Database | null = JSON.parse(data);
		//console.log(database);

		console.log(param3 + " " + param4 + " " + param5);
		let u1: UserModel | null = null;
		if (param4 != null && param5 != null && param3 != null) {
			u1 = { username: param4, password: param5, name: param3, type: 1 }
		}
		else {
			if (param4 == null || param4 == "") {
				res.status(200).send({ message: "Introduce an username!" })
				return;
			}
			if (param3 == null || param3 == "") {
				res.status(200).send({ message: "Introduce a name!" })
				return;
			}
			if (param5 == null || param5 == "") {
				res.status(200).send({ message: "Introduce a password!" })
				return;
			}
		}
		if (u1 != null) {
			database?.user.unshift(u1);
			res.status(200).send(u1);
		}
		if (database != null) {
			fs.writeFile("./data/presaved.json", JSON.stringify(database), 'utf8', function (err) {
				if (err) {
					console.log("An error occured while writing JSON Object to File.");
					return console.log(err);
				}

				console.log("JSON file has been saved.");
			});
		}
	})
})
app.post('/test3', (req: any, res: any) => {
	const { param6, param7, param8,paramg1 } = req.body;
	fs.readFile("./data/presaved.json", 'utf8', (err: any, data: any) => {
		if (err) {
			res.status(200).send({ message: "Failed" })
			throw err;
		}
		const database: Database | null = JSON.parse(data);
		//console.log(database);
		let idInput = 0;
		const nameInput = param6;
		const priceInput = param7;
		const quantityInput = param8;
		const quantityGramsInput=paramg1;
		if (database?.product) {
			idInput = database.product.length + 1;
		}
		if (nameInput != null && priceInput != null && quantityInput != null) {
			if (Number(priceInput) > 0 && Number(priceInput) < 1500 && Number(quantityInput) >= 0 && Number(quantityInput) < 1500) {
				const p: ProductModel = { id: idInput, name: nameInput, price: Number(priceInput), quantity: Number(quantityInput),quantityGrams:Number(quantityGramsInput) }
				database?.product.unshift(p);
				idInput++;
				console.log(database);
				res.status(200).send({ message: "Product added!" });
			}
			else {
				res.status(200).send({ message: "Introduce valid quantity,grammage and price!" })
				return;
			}
		}
		else {

			if (nameInput == null) {
				res.status(200).send({ message: "Introduce a name!" })
				return;
			}
			if (priceInput == null) {
				res.status(200).send({ message: "Introduce a price!" })
				return;
			}
			if (quantityInput == null) {
				res.status(200).send({ message: "Introduce a quantity!" })
				return;
			}
			if (quantityInput == null) {
				res.status(200).send({ message: "Introduce a grammage!" })
				return;
			}
		}
		console.log(database);
		if (database != null) {
			fs.writeFile("./data/presaved.json", JSON.stringify(database), 'utf8', function (err) {
				if (err) {
					console.log("An error occured while writing JSON Object to File.");
					return console.log(err);
				}

				console.log("JSON file has been saved.");
			});
		}

	})
})
app.post('/test4', (req: any, res: any) => {
	const { param9 } = req.body;
	fs.readFile("./data/presaved.json", 'utf8', (err: any, data: any) => {
		if (err) {
			res.status(200).send({ message: "Failed" })
			throw err;
		}
		const database: Database | null = JSON.parse(data);
		//console.log(database);
		const nameInput = param9;
		console.log(nameInput);
		let ok = 0;
		if (nameInput != null) {

			if (database != null) {
				for (let i = 0; i < database.product.length; i++)
					if (database.product[i].name === nameInput) {
						//console.log("am intrat in if")
						database.product.splice(i, 1);
						res.status(200).send({ message: "Product Deleted!" })
						ok++;
					}
			}
		}
		else {
			res.status(200).send({ message: "Enter a product name!" });
			return;
		}
		if (ok == 0) {
			res.status(200).send({ message: "Product not found!" });
			return;
		}


		//console.log(database);
		if (database != null) {
			fs.writeFile("./data/presaved.json", JSON.stringify(database), 'utf8', function (err) {
				if (err) {
					console.log("An error occured while writing JSON Object to File.");
					return console.log(err);
				}

				console.log("JSON file has been saved.");
			});
		}

	})
})

app.post('/test5', (req: any, res: any) => {
	const { param10, param11, param12,paramg2 } = req.body;
	fs.readFile("./data/presaved.json", 'utf8', (err: any, data: any) => {
		if (err) {
			res.status(200).send({ message: "Failed" })
			throw err;
		}
		const database: Database | null = JSON.parse(data);
		//console.log(database);
		const nameInput = param10;
		const priceInput = param11;
		const quantityInput = param12;
		const quantityGramsInput =paramg2;

		console.log(nameInput);
		let ok = 0;

		if (nameInput != null) {
			if (database != null) {
				for (let i = 0; i < database.product.length; i++)
					if (database.product[i].name === nameInput) {
						ok++;
						if (priceInput != null) {
							if (!(Number(priceInput) > 0 && Number(priceInput) < 1500)) {
								res.status(200).send({ message: "Introduce a correct price!" });
								return;
							}
							else {
								database.product[i].price = Number(priceInput);
							}

						}
						if (quantityInput) {
							if (!(Number(quantityInput) > 0 && Number(quantityInput) < 1500)) {
								res.status(200).send({ message: "Introduce a correct quantity!" });
								return;
							}
							else {
								database.product[i].quantity = Number(quantityInput);
							}
						}
						if (quantityGramsInput) {
							if (!(Number(quantityGramsInput) > 0 && Number(quantityGramsInput) < 4500)) {
								res.status(200).send({ message: "Introduce a correct grammage!" });
								return;
							}
							else {
								database.product[i].quantityGrams = Number(quantityGramsInput);
							}
						}


						break;
					}
			}
		}
		else {
			res.status(200).send({ message: "Introduce a name!" });
			return;
		}
		if (ok == 0) {
			res.status(200).send({ message: "Product not found" })
			return;
		}
		else {
			res.status(200).send({ message: "Product edited!" })
		}


		//console.log(database);
		if (database != null) {
			fs.writeFile("./data/presaved.json", JSON.stringify(database), 'utf8', function (err) {
				if (err) {
					console.log("An error occured while writing JSON Object to File.");
					return console.log(err);
				}

				console.log("JSON file has been saved.");
			});
		}

	})
})
app.post('/test6', (req: any, res: any) => {
	const { param9 } = req.body;
	fs.readFile("./data/presaved.json", 'utf8', (err: any, data: any) => {
		if (err) {
			res.status(200).send({ message: "Failed" })
			throw err;
		}
		const database: Database | null = JSON.parse(data);
		//console.log(database);
		res.status(200).send(database?.product);

	})
})
app.post('/test7', (req: any, res: any) => {
	const { param10 } = req.body;
	const o: OrderModel = param10;
	fs.readFile("./data/presaved.json", 'utf8', (err: any, data: any) => {
		if (err) {
			res.status(200).send({ message: "Failed" })
			throw err;
		}
		const database: Database | null = JSON.parse(data);
		console.log(database);
		res.status(200).send(database?.product);
		if (database) {
			if (database.order == null || database.order == undefined) {
				database.order = [];
			}
		}
		o.orderid=database?.order.length;
		if (database) { database.order.push(o); }
		if (database?.product)
			for (let j = 0; j < o.productids.length; j++) {
				for (let i = 0; i < database?.product.length; i++) {
					if (o.productids[j] == database.product[i].id) {
						database.product[i].quantity--;
					}

				}
			}
		if (database != null) {
			fs.writeFile("./data/presaved.json", JSON.stringify(database), 'utf8', function (err) {
				if (err) {
					console.log("An error occured while writing JSON Object to File.");
					return console.log(err);
				}

				console.log("JSON file has been saved.");
			});
		}
	})
})



try {
	app.listen(port, (): void => {
		console.log(`Connected successfully on port ${port}`);
	});
} catch (error) {
	console.error(`Error occured: ${error.message}`);
}

