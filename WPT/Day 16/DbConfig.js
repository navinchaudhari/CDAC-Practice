import {connect} from "mongoose";


export function getConnection() {
    try {
        await connect ("mongodb://127.0.0.1/my_demo_db");
    } catch (err) {
      console.log(err);
        
    }
}