import React, { Component } from "react";
import ClientService from "../services/ClientService";

class ListClient extends Component{
    constructor(props){
        super(props)

        this.state = {
            clients: []
        }
    }

    componentDidMount() {
        ClientService.getClients().then((res) => {
            this.setState({ clients: res.data });
        })
    }
    render() {
        return (
            <div>
                <h2>Parking Sys</h2>
                <div className="row">
                    <table className="table table-striped table-bordered">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Nome</th>
                                <th>Vaga_ID</th>
                                <th>Veiculo_ID</th>
                            </tr>
                        </thead>
                        <tbody>
                            {
                                this.state.clients.map(
                                    client => 
                                    <tr key={client.id}>
                                        <td> { client.id } </td>
                                        <td> { client.nome } </td>
                                        <td> { client.vaga } </td>
                                        <td> { client.veiculo } </td>
                                    </tr>
                                )
                            }
                        </tbody>
                    </table>
                </div>
            </div>
        )
    }
}

export default ListClient